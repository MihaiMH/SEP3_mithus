package dk.via.mithus.mappers;

import dk.via.mithus.protobuf.Role;
import dk.via.mithus.protobuf.User;

public abstract class UserMapper {
    public static User mapProto(dk.via.mithus.Shared.User user) {
        return User.newBuilder()
                .setId(user.getId())
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setRole(mapRoleProto(user.getRole()))
                .build();
    }

    public static Role mapRoleProto(dk.via.mithus.Shared.Role role) {
        return Role.newBuilder()
                .setId(role.getId())
                .setName(role.getName())
                .build();
    }
}
