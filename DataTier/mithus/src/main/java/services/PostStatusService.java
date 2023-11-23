//package services;
//
//import dk.via.mithus.DAOInterfaces.PostStatusDAO;
//import dk.via.mithus.mappers.PostMapper;
//import dk.via.mithus.protobuf.PostStatus;
//import dk.via.mithus.protobuf.PostStatusServiceGrpc;
//import io.grpc.stub.StreamObserver;
//import org.lognet.springboot.grpc.GRpcService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@GRpcService
//public class PostStatusService extends PostStatusServiceGrpc.PostStatusServiceImplBase {
//    @Autowired
//    private PostStatusDAO postStatusDAO;
//
//    public PostStatusService() {}
//
//    @Override
//    public void createPostStatus(PostStatus request, StreamObserver<PostStatus> responseObserver) {
//        dk.via.mithus.Shared.PostStatus postStatus = new dk.via.mithus.Shared.PostStatus(request.getStatus());
//
//        dk.via.mithus.Shared.PostStatus createdPostStatus = postStatusDAO.createPostStatus(postStatus);
//        responseObserver.onNext(PostMapper.mapPostStatusProto(createdPostStatus));
//        responseObserver.onCompleted();
//    }
//}
