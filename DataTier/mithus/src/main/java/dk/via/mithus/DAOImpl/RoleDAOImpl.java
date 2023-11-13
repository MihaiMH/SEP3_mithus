package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.RoleDAO;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findRole(String roleId) {
        return roleRepository.findById(Long.parseLong(roleId)).orElse(null);
    }
}
