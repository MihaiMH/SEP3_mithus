package dk.via.mithus.repositories;

import dk.via.mithus.Shared.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends JpaRepository<Cost, Long> {
}
