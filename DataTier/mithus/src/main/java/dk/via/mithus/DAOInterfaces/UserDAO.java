package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.User;

public interface UserDAO {
    User registerUser(User user);
    User loginUser(String email);
    User findUser(Long id);
}
