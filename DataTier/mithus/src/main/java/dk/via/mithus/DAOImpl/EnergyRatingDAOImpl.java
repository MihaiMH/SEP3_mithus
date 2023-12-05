package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.EnergyRatingDAO;
import dk.via.mithus.Shared.EnergyRating;
import dk.via.mithus.repositories.EnergyRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class EnergyRatingDAOImpl implements EnergyRatingDAO {
    @Autowired
    private EnergyRatingRepository energyRatingRepository;

    @Override
    public EnergyRating findEnergyRating(Long energyRatingId) {
        return energyRatingRepository.findById(energyRatingId).orElse(null);
    }

    @Override
    public Collection<EnergyRating> getEnergyRatings() {
        return energyRatingRepository.findAllByOrderByIdAsc();
    }
}
