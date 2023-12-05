package services;

import dk.via.mithus.DAOInterfaces.RoleDAO;
import dk.via.mithus.DAOInterfaces.UserDAO;
import dk.via.mithus.mappers.UserMapper;
import dk.via.mithus.protobuf.*;
import dk.via.mithus.protobuf.Void;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collection;

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

        dk.via.mithus.Shared.Role role = roleDAO.findRole(request.getRoleId());
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

    @Override
    public void getRoles(Void request, StreamObserver<Roles> responseObserver) {
        dk.via.mithus.Shared.Roles roles = roleDAO.getRoles();

        Roles rolesResponse = Roles.newBuilder()
                .setClient(UserMapper.mapRoleProto(roles.getClient()))
                .setLandlord(UserMapper.mapRoleProto(roles.getLandLord()))
                .setModerator(UserMapper.mapRoleProto(roles.getModerator()))
                .setAdministrator(UserMapper.mapRoleProto(roles.getAdministrator()))
                .setInactive(UserMapper.mapRoleProto(roles.getInactive()))
                .setPending(UserMapper.mapRoleProto(roles.getPending()))
                .build();

        responseObserver.onNext(rolesResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUser(UserUpdate request, StreamObserver<User> responseObserver) {
        dk.via.mithus.Shared.User user = userDAO.findUser(request.getId());

        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        dk.via.mithus.Shared.User updatedUser = userDAO.updateUser(user);
        responseObserver.onNext(UserMapper.mapProto(updatedUser));
        responseObserver.onCompleted();
    }

    @Override
    public void getUsers(Void request, StreamObserver<Users> responseObserver) {
        Collection<dk.via.mithus.Shared.User> users = userDAO.getUsers();
        Collection<User> usersList = new ArrayList<>();

        for (dk.via.mithus.Shared.User user : users) {
            usersList.add(UserMapper.mapProto(user));
        }

        Users usersResponse = Users.newBuilder()
                .addAllUsers(usersList)
                .build();

        responseObserver.onNext(usersResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getUserById(UserId request, StreamObserver<User> responseObserver) {
        dk.via.mithus.Shared.User user = userDAO.findUser(request.getUserId());
        responseObserver.onNext(UserMapper.mapProto(user));
        responseObserver.onCompleted();
    }

    @Override
    public void setUserStatus(RoleUpdate request, StreamObserver<Void> responseObserver) {
        dk.via.mithus.Shared.User user = userDAO.findUser(request.getUserId());
        dk.via.mithus.Shared.Role role = roleDAO.findRole(request.getRoleId());

        user.setRole(role);
        userDAO.updateUser(user);
        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }
}
