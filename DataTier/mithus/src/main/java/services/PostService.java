package services;

import dk.via.mithus.DAOInterfaces.PostDAO;
import dk.via.mithus.DAOInterfaces.UserDAO;
import dk.via.mithus.Shared.User;
import dk.via.mithus.mappers.PostMapper;
import dk.via.mithus.protobuf.*;
import dk.via.mithus.protobuf.Void;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@GRpcService
public class PostService extends PostServiceGrpc.PostServiceImplBase {
    @Autowired
    private PostDAO postDAO;
    @Autowired
    private UserDAO userDAO;
    public PostService() {}

    @Override
    public void createPost(Post request, StreamObserver<Post> responseObserver) {
        dk.via.mithus.Shared.Post post = new dk.via.mithus.Shared.Post(
                request.getTitle(),
                request.getDescription(),
                request.getStreet(),
                request.getArea(),
                request.getType(),
                request.getMaxTenants(),
                request.getEnergyRating(),
                request.getDeposit(),
                request.getMoveInPrice(),
                request.getUtilities(),
                request.getMonthlyRent(),
                request.getStatus(),
                request.getIsFurnished(),
                request.getHasBalcony(),
                request.getSmokingAllowed(),
                request.getHasParking(),
                request.getHasDryer(),
                request.getHasDishwasher(),
                request.getHasWashingMachine());

        post.setCreationDate(LocalDateTime.now());

//        User user = userDAO.getUser(request.getUserId());

//        post.setLandlord(user);

        dk.via.mithus.Shared.Post createdPost = postDAO.createPost(post);

        responseObserver.onNext(PostMapper.mapProto(createdPost));
        responseObserver.onCompleted();
    }

    @Override
    public void findPost(SearchField request, StreamObserver<Post> responseObserver) {
        super.findPost(request, responseObserver);
    }

    @Override
    public void getPosts(Void request, StreamObserver<Posts> responseObserver) {
        super.getPosts(request, responseObserver);
    }

    @Override
    public void getPostsByLandlord(SearchField request, StreamObserver<Posts> responseObserver) {
        super.getPostsByLandlord(request, responseObserver);
    }

    @Override
    public void updatePost(Post request, StreamObserver<Void> responseObserver) {
        super.updatePost(request, responseObserver);
    }

    @Override
    public void deletePost(Post request, StreamObserver<Void> responseObserver) {
        super.deletePost(request, responseObserver);
    }
}
