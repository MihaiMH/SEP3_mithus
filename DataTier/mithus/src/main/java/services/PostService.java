package services;

import dk.via.mithus.DAOInterfaces.*;
import dk.via.mithus.Shared.Post;
import dk.via.mithus.mappers.PostMapper;
import dk.via.mithus.protobuf.*;
import dk.via.mithus.protobuf.Void;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

@GRpcService
public class PostService extends PostServiceGrpc.PostServiceImplBase {
    @Autowired
    private PostDAO postDAO;
    @Autowired
    private AmenityDAO amenityDAO;
    @Autowired
    private ImageDAO imageDAO;
    @Autowired
    private AddressDAO addressDAO;
    @Autowired
    private CostDAO costDAO;
    @Autowired
    private EnergyRatingDAO energyRatingDAO;
    @Autowired
    private PostStatusDAO postStatusDAO;
    @Autowired
    private HousingTypeDAO housingTypeDAO;
    @Autowired
    private UserDAO userDAO;

    public PostService() {}

    @Override
    public void createPost(PostCreation request, StreamObserver<PostCreation> responseObserver) {
        dk.via.mithus.Shared.Post post = new dk.via.mithus.Shared.Post(
                request.getTitle(),
                request.getDescription(),
                request.getArea(),
                request.getMaxTenants(),
                request.getCreationDate());

        dk.via.mithus.Shared.EnergyRating energyRating = energyRatingDAO.findEnergyRating(request.getEnergyRating().getId());
        if (energyRating != null)
            post.setEnergyRating(energyRating);

        dk.via.mithus.Shared.PostStatus postStatus = postStatusDAO.findPostStatus(request.getStatus().getId());
        if (postStatus != null)
            post.setStatus(postStatus);

        dk.via.mithus.Shared.HousingType housingType = housingTypeDAO.findHousingType(request.getHousingType().getId());
        if (housingType != null)
            post.setType(housingType);

        dk.via.mithus.Shared.Cost cost = costDAO.findCost(request.getCost().getId());
        if (cost != null)
            post.setCost(cost);

        dk.via.mithus.Shared.Address address = addressDAO.findAddress(request.getAddress().getId());
        if (address != null)
            post.setAddress(address);

        dk.via.mithus.Shared.User user = userDAO.loginUser(request.getLandlord().getEmail());
        if (user != null)
            post.setLandlord(user);

        for (Amenity amenity : request.getAmenityList()) {
            dk.via.mithus.Shared.Amenity foundAmenity = amenityDAO.findAmenity(amenity.getId());
            if (foundAmenity != null)
                post.addAmenity(foundAmenity);
        }

        for (Image image: request.getImageList()) {
            dk.via.mithus.Shared.Image foundImage = imageDAO.findImage(image.getId());
            if (foundImage != null)
                post.addImage(foundImage);
        }

        dk.via.mithus.Shared.Post createdPost = postDAO.createPost(post);

        responseObserver.onNext(PostMapper.mapProto(createdPost));
        responseObserver.onCompleted();
    }

    @Override
    public void getPosts(Void request, StreamObserver<Posts> responseObserver) {
        Collection<dk.via.mithus.Shared.Post> posts = postDAO.getPosts();

        Collection<PostCreation> postCollection = new ArrayList<>();

        for (var post : posts) {
            postCollection.add(PostMapper.mapProto(post));
        }

        Posts postsResponse = Posts.newBuilder()
                .addAllPosts(postCollection)
                .build();

        responseObserver.onNext(postsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getPost(PostId request, StreamObserver<PostCreation> responseObserver) {
        Post post = postDAO.findPost(request.getId());

        responseObserver.onNext(PostMapper.mapProto(post));
        responseObserver.onCompleted();
    }

    @Override
    public void updatePost(PostCreation request, StreamObserver<PostCreation> responseObserver) {
        Post foundPost = postDAO.findPost(request.getId());
        foundPost.setTitle(request.getTitle());
        foundPost.setDescription(request.getDescription());
        foundPost.setArea(request.getArea());
        foundPost.setMaxTenants(request.getMaxTenants());
        foundPost.setCreationDate(request.getCreationDate());
        foundPost.setType(housingTypeDAO.findHousingType(request.getHousingType().getId()));
        foundPost.setStatus(postStatusDAO.findPostStatus(request.getStatus().getId()));
        foundPost.setEnergyRating(energyRatingDAO.findEnergyRating(request.getEnergyRating().getId()));
        foundPost.setCost(costDAO.findCost(request.getCost().getId()));
        foundPost.setAddress(addressDAO.findAddress(request.getAddress().getId()));
        foundPost.setImages(imageDAO.getImages());
        foundPost.setAmenities(amenityDAO.getAmenities());

        Post post = postDAO.updatePost(foundPost);
        responseObserver.onNext(PostMapper.mapProto(post));
        responseObserver.onCompleted();
    }

    @Override
    public void deletePost(PostDelete request, StreamObserver<Void> responseObserver) {
        postDAO.deletePost(request.getId());

        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getPostStatuses(Void request, StreamObserver<PostStatuses> responseObserver) {
        dk.via.mithus.Shared.PostStatuses postStatuses = postStatusDAO.getPostStatuses();

        PostStatuses postStatusesResponse = PostStatuses.newBuilder()
                .setAvailable(PostMapper.mapPostStatusProto(postStatuses.getAvailable()))
                .setReserved(PostMapper.mapPostStatusProto(postStatuses.getReserved()))
                .setHidden(PostMapper.mapPostStatusProto(postStatuses.getHidden()))
                .setDenied(PostMapper.mapPostStatusProto(postStatuses.getDenied()))
                .setPending(PostMapper.mapPostStatusProto(postStatuses.getPending()))
                .build();

        responseObserver.onNext(postStatusesResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getHousingTypes(Void request, StreamObserver<HousingTypes> responseObserver) {
        Collection<dk.via.mithus.Shared.HousingType> housingTypes = housingTypeDAO.getHousingTypes();
        Collection<HousingType> housingTypeCollection = new ArrayList<>();

        for (var housingType : housingTypes) {
            housingTypeCollection.add(PostMapper.mapHousingTypeProto(housingType));
        }

        HousingTypes housingTypesResponse = HousingTypes.newBuilder()
                .addAllHousingTypes(housingTypeCollection)
                .build();

        responseObserver.onNext(housingTypesResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getEnergyRatings(Void request, StreamObserver<EnergyRatings> responseObserver) {
        Collection<dk.via.mithus.Shared.EnergyRating> energyRatings = energyRatingDAO.getEnergyRatings();
        Collection<EnergyRating> energyRatingCollection = new ArrayList<>();

        for (var energyRating : energyRatings) {
            energyRatingCollection.add(PostMapper.mapEnergyRatingProto(energyRating));
        }

        EnergyRatings energyRatingsResponse = EnergyRatings.newBuilder()
                .addAllEnergyRatings(energyRatingCollection)
                .build();

        responseObserver.onNext(energyRatingsResponse);
        responseObserver.onCompleted();
    }
}
