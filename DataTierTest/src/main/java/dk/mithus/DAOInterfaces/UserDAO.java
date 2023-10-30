package dk.mithus.DAOInterfaces;

import dk.mithus.Shared.User;

public interface UserDAO {
    User registerUser(User user);
    User loginUser(User user);
    User findUser(String email);
}
