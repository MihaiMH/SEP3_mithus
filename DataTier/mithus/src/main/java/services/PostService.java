package services;

import dk.via.mithus.DAOInterfaces.*;
import dk.via.mithus.mappers.PostMapper;
import dk.via.mithus.protobuf.*;
import dk.via.mithus.protobuf.Void;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.units.qual.C;
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
    public void createPost(PostCreation request, StreamObserver<dk.via.mithus.protobuf.PostResponse> responseObserver) {
        dk.via.mithus.Shared.Post post = new dk.via.mithus.Shared.Post(
                request.getTitle(),
                request.getDescription(),
                request.getArea(),
                request.getMaxTenants(),
                request.getCreationDate());

        dk.via.mithus.Shared.EnergyRating energyRating = energyRatingDAO.findEnergyRating(request.getEnergyRatingId());
        if (energyRating != null)
            post.setEnergyRating(energyRating);

        dk.via.mithus.Shared.PostStatus postStatus = postStatusDAO.findPostStatus(request.getStatusId());
        if (postStatus != null)
            post.setStatus(postStatus);

        dk.via.mithus.Shared.HousingType housingType = housingTypeDAO.findHousingType(request.getHousingTypeId());
        if (housingType != null)
            post.setType(housingType);

        dk.via.mithus.Shared.User user = userDAO.findUser(request.getLandlordId());
        if (user != null)
            post.setLandlord(user);

        dk.via.mithus.Shared.Cost costToCreate = new dk.via.mithus.Shared.Cost(
                request.getCost().getDeposit(),
                request.getCost().getMoveInPrice(),
                request.getCost().getUtilities(),
                request.getCost().getMonthlyRent()
        );
        dk.via.mithus.Shared.Cost costCreated = costDAO.createCost(costToCreate);
        post.setCost(costCreated);

        dk.via.mithus.Shared.Address addressToCreate = new dk.via.mithus.Shared.Address(
                request.getAddress().getStreet(),
                request.getAddress().getCity(),
                request.getAddress().getCountry(),
                request.getAddress().getZipCode()
        );
        dk.via.mithus.Shared.Address addressCreated = addressDAO.createAddress(addressToCreate);
        post.setAddress(addressCreated);

        Collection<dk.via.mithus.Shared.Amenity> createdAmenities = new ArrayList<>();
        for (Amenity amenity : request.getAmenityList()) {
            dk.via.mithus.Shared.Amenity newAmenity = new dk.via.mithus.Shared.Amenity(
                    amenity.getName(),
                    amenity.getDescription()
            );

            createdAmenities.add(amenityDAO.createAmenity(newAmenity));
        }

        for (dk.via.mithus.Shared.Amenity createdAmenity : createdAmenities) {
            post.addAmenity(createdAmenity);
        }

        Collection<dk.via.mithus.Shared.Image> createdImages = new ArrayList<>();
        for (Image image : request.getImageList()) {
            dk.via.mithus.Shared.Image newImage = new dk.via.mithus.Shared.Image(
                    image.getAddress()
            );

            createdImages.add(imageDAO.createImage(newImage));
        }

        for (dk.via.mithus.Shared.Image image: createdImages) {
            post.addImage(image);
        }

        dk.via.mithus.Shared.Post createdPost = postDAO.createPost(post);

        responseObserver.onNext(PostMapper.mapProto(createdPost));
        responseObserver.onCompleted();
    }

    @Override
    public void getPosts(Void request, StreamObserver<Posts> responseObserver) {
        Collection<dk.via.mithus.Shared.Post> posts = postDAO.getPosts();

        Collection<PostResponse> postCollection = new ArrayList<>();

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
    public void getPost(PostId request, StreamObserver<PostResponse> responseObserver) {
        dk.via.mithus.Shared.Post post = postDAO.findPost(request.getId());

        responseObserver.onNext(PostMapper.mapProto(post));
        responseObserver.onCompleted();
    }


    @Override
    public void updatePost(PostCreation request, StreamObserver<PostResponse> responseObserver) {
        dk.via.mithus.Shared.Post foundPost = postDAO.findPost(request.getId());
        foundPost.setTitle(request.getTitle());
        foundPost.setDescription(request.getDescription());
        foundPost.setArea(request.getArea());
        foundPost.setMaxTenants(request.getMaxTenants());
        foundPost.setCreationDate(request.getCreationDate());
        foundPost.setType(housingTypeDAO.findHousingType(request.getHousingTypeId()));
        foundPost.setStatus(postStatusDAO.findPostStatus(request.getStatusId()));
        foundPost.setEnergyRating(energyRatingDAO.findEnergyRating(request.getEnergyRatingId()));
        foundPost.setLandlord(userDAO.findUser(request.getLandlordId()));

        dk.via.mithus.Shared.Cost costToCreate = new dk.via.mithus.Shared.Cost(
                request.getCost().getDeposit(),
                request.getCost().getMoveInPrice(),
                request.getCost().getUtilities(),
                request.getCost().getMonthlyRent()
        );
        dk.via.mithus.Shared.Cost costCreated = costDAO.createCost(costToCreate);
        foundPost.setCost(costCreated);

        dk.via.mithus.Shared.Address addressToCreate = new dk.via.mithus.Shared.Address(
                request.getAddress().getStreet(),
                request.getAddress().getCity(),
                request.getAddress().getCountry(),
                request.getAddress().getZipCode()
        );
        dk.via.mithus.Shared.Address addressCreated = addressDAO.createAddress(addressToCreate);
        foundPost.setAddress(addressCreated);

        for (int i = 0; i < request.getAmenityList().size(); i++) {
            dk.via.mithus.Shared.Amenity amenity = new dk.via.mithus.Shared.Amenity(
                    request.getAmenityList().get(i).getName(),
                    request.getAmenityList().get(i).getDescription()
            );

            amenityDAO.createAmenity(amenity);
        }

        for (int i = 0; i < request.getImageList().size(); i++) {
            dk.via.mithus.Shared.Image image = new dk.via.mithus.Shared.Image(
                    request.getImageList().get(i).getAddress()
            );

            imageDAO.createImage(image);
        }

        dk.via.mithus.Shared.Post post = postDAO.updatePost(foundPost);
        responseObserver.onNext(PostMapper.mapProto(post));
        responseObserver.onCompleted();
    }

    @Override
    public void setPostStatus(PostStatusUpdate request, StreamObserver<PostResponse> responseObserver) {
        dk.via.mithus.Shared.Post post = postDAO.findPost(request.getPostId());
        dk.via.mithus.Shared.PostStatus postStatus = postStatusDAO.findPostStatus(request.getStatusId());

        post.setStatus(postStatus);

        dk.via.mithus.Shared.Post updatedPost = postDAO.updatePost(post);

        responseObserver.onNext(PostMapper.mapProto(updatedPost));
        responseObserver.onCompleted();
    }

    @Override
    public void deletePost(PostId request, StreamObserver<Void> responseObserver) {
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
