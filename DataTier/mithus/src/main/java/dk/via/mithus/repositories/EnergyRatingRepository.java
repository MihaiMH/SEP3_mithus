package dk.via.mithus.repositories;

import dk.via.mithus.Shared.EnergyRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface EnergyRatingRepository extends JpaRepository<EnergyRating, Long> {
    Collection<EnergyRating> findAllByOrderByIdAsc();
}
