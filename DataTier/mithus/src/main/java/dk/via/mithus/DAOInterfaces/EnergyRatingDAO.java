package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.EnergyRating;

import java.util.Collection;

public interface EnergyRatingDAO {
    EnergyRating findEnergyRating(Long energyRatingId);
    Collection<EnergyRating> getEnergyRatings();
}
