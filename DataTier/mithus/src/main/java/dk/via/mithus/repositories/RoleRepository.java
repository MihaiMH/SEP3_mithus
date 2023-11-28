package dk.via.mithus.repositories;

import dk.via.mithus.Shared.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Collection<Role> findAllByOrderByIdAsc();
}
