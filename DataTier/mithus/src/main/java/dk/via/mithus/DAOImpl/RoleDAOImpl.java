package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.RoleDAO;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.Shared.Roles;
import dk.via.mithus.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRole(Long roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    @Override
    public Roles getRoles() {
        Collection<Role> roles = roleRepository.findAllByOrderByIdAsc();
        Role[] rolesArray = roles.toArray(new Role[0]);
        return new Roles(rolesArray[0], rolesArray[1], rolesArray[2], rolesArray[3], rolesArray[4], rolesArray[5]);
    }
}
