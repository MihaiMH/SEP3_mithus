package services;

import dk.via.mithus.DAOInterfaces.*;
import dk.via.mithus.Shared.HousingType;
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

    public PostService() {}

    @Override
    public void createPost(PostCreation request, StreamObserver<Post> responseObserver) {
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

        HousingType housingType = housingTypeDAO.findHousingType(request.getHousingType().getId());
        if (housingType != null)
            post.setType(housingType);

        dk.via.mithus.Shared.Cost cost = costDAO.findCost(request.getCost().getId());
        if (cost != null)
            post.setCost(cost);

        dk.via.mithus.Shared.Address address = addressDAO.findAddress(request.getAddress().getId());
        if (address != null)
            post.setAddress(address);

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

        Collection<Post> postCollection = new ArrayList<>();

        for (var post : posts) {
            postCollection.add(PostMapper.mapProto(post));
        }

        Posts postsResponse = Posts.newBuilder()
                .addAllPosts(postCollection)
                .build();

        responseObserver.onNext(postsResponse);
        responseObserver.onCompleted();
    }
}
