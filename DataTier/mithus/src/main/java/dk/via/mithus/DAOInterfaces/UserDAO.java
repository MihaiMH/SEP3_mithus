package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.User;

import java.util.Collection;

public interface UserDAO {
    User registerUser(User user);
    User loginUser(String email);
    User findUser(Long id);
    User updateUser(User user);
    Collection<User> getUsers();
}
