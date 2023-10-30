package dk.via.mithus.mappers;

import dk.via.mithus.protobuf.User;

public abstract class UserMapper {
    public static User mapProto(dk.via.mithus.Shared.User user) {
        return User.newBuilder()
                .setId(user.getId().toString())
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .build();
    }
}
