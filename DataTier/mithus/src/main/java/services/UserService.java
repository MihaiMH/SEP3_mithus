package services;

import dk.via.mithus.DAOInterfaces.RoleDAO;
import dk.via.mithus.DAOInterfaces.UserDAO;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.mappers.UserMapper;
import dk.via.mithus.protobuf.User;
import dk.via.mithus.protobuf.UserCreation;
import dk.via.mithus.protobuf.UserLogin;
import dk.via.mithus.protobuf.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private RoleDAO roleDAO;

    public UserService() {}

    @Override
    public void registerUser(UserCreation request, StreamObserver<User> responseObserver) {
        dk.via.mithus.Shared.User user = new dk.via.mithus.Shared.User(
                request.getEmail(),
                request.getPassword(),
                request.getFirstName(),
                request.getLastName()
        );

        Role role = roleDAO.findRole(request.getRoleId());
        user.setRole(role);

        dk.via.mithus.Shared.User registeredUser = userDAO.registerUser(user);
        responseObserver.onNext(UserMapper.mapProto(registeredUser));
        responseObserver.onCompleted();
    }

    @Override
    public void loginUser(UserLogin request, StreamObserver<User> responseObserver) {
        dk.via.mithus.Shared.User user = userDAO.loginUser(
                request.getEmail()
        );

        responseObserver.onNext(UserMapper.mapProto(user));
        responseObserver.onCompleted();
    }
}
