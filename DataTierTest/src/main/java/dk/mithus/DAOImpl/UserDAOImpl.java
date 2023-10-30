package dk.mithus.DAOImpl;

import dk.mithus.DAOInterfaces.UserDAO;
import dk.mithus.Shared.Role;
import dk.mithus.Shared.User;
import dk.mithus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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
}
