package dk.via.mithus.DAOInterfaces;


import dk.via.mithus.Shared.Role;
import dk.via.mithus.Shared.Roles;

public interface RoleDAO {
    Role findRole(Long roleId);
    Roles getRoles();
}
