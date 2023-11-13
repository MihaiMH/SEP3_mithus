package dk.via.mithus.repositories;

import dk.via.mithus.Shared.EnergyRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyRatingRepository extends JpaRepository<EnergyRating, Integer> {
}
