package dk.mithus.services;

import dk.mithus.DAOInterfaces.PostDAO;
import dk.mithus.protobuf.PostServiceGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService extends PostServiceGrpc.PostServiceImplBase {
    @Autowired
    private PostDAO postDAO;
}
