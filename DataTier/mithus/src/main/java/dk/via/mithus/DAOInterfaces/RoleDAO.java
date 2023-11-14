package dk.via.mithus.DAOInterfaces;


import dk.via.mithus.Shared.Role;

import java.util.Collection;

public interface RoleDAO {
    Role findRole(Long roleId);
    Collection<Role> getRoles();
}
