package dk.via.mithus.repositories;

import dk.via.mithus.Shared.HousingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface HousingTypeRepository extends JpaRepository<HousingType, Long> {
    Collection<HousingType> findAllByOrderByIdAsc();
}
