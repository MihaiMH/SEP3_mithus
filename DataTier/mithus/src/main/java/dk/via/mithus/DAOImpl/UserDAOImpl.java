package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.UserDAO;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.Shared.User;
import dk.via.mithus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private UserRepository userRepository;

    public UserDAOImpl() {}

    @Override
    public User registerUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("CLIENT"));
        user.setRoles(roles);
        userRepository.save(user);
        return user;
    }

    @Override
    public User loginUser(User user) {
        return userRepository.findUserByEmail(user.getEmail());
    }

    @Override
    public User findUser(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User getUser(String id) {
        return userRepository.findById(UUID.fromString(id)).orElse(null);
    }
}
