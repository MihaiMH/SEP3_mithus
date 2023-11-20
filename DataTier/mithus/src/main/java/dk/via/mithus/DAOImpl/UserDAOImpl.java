package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.UserDAO;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.Shared.User;
import dk.via.mithus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private UserRepository userRepository;

    public UserDAOImpl() {}

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User loginUser(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User findUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> getUsers() {
        return userRepository.findAll();
    }
}
