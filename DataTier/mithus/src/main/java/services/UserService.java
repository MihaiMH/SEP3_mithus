package services;

import dk.via.mithus.DAOInterfaces.UserDAO;
import dk.via.mithus.mappers.UserMapper;
import dk.via.mithus.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {
    @Autowired
    private UserDAO userDAO;

    public UserService() {}

    @Override
    public void loginUsers(LoginUser request, StreamObserver<User> responseObserver) {
        dk.via.mithus.Shared.User user = new dk.via.mithus.Shared.User();

        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        dk.via.mithus.Shared.User loginUser = userDAO.loginUser(user);

        responseObserver.onNext(UserMapper.mapProto(loginUser));
        responseObserver.onCompleted();
    }

    @Override
    public void createUser(RegisterUser request, StreamObserver<User> responseObserver) {
        dk.via.mithus.Shared.User user = new dk.via.mithus.Shared.User(
                request.getEmail(),
                request.getPassword(),
                request.getFirstName(),
                request.getLastName());

        dk.via.mithus.Shared.User registeredUser = userDAO.registerUser(user);

        responseObserver.onNext(UserMapper.mapProto(registeredUser));
        responseObserver.onCompleted();
    }

    @Override
    public void findUser(SearchField request, StreamObserver<User> responseObserver) {
        dk.via.mithus.Shared.User user = userDAO.findUser(request.getSearch());

        if (user != null) {
            responseObserver.onNext(UserMapper.mapProto(user));
            responseObserver.onCompleted();
        } else {
          responseObserver.onError(new Exception("User not found!"));
        }
    }
}
