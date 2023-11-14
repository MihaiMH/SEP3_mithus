package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.RoleDAO;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRole(Long roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    @Override
    public Collection<Role> getRoles() {
        return roleRepository.findAll();
    }
}
