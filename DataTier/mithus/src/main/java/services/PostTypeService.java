package services;

import dk.via.mithus.DAOInterfaces.PostTypeDAO;
import dk.via.mithus.mappers.PostMapper;
import dk.via.mithus.protobuf.PostType;
import dk.via.mithus.protobuf.PostTypeServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class PostTypeService extends PostTypeServiceGrpc.PostTypeServiceImplBase {
    @Autowired
    private PostTypeDAO postTypeDAO;

    public PostTypeService() {}

    @Override
    public void createPostType(PostType request, StreamObserver<PostType> responseObserver) {
        dk.via.mithus.Shared.PostType postType = new dk.via.mithus.Shared.PostType(request.getName());

        dk.via.mithus.Shared.PostType createdPostType = postTypeDAO.createPostType(postType);
        responseObserver.onNext(PostMapper.mapPostTypeProto(createdPostType));
        responseObserver.onCompleted();
    }
}
