package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.User;

public interface UserDAO {
    User registerUser(User user);
    User loginUser(User user);
    User findUser(String email);
    User getUser(String id);
}
