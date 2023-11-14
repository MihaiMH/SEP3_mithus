package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.EnergyRating;

import java.util.Collection;

public interface EnergyRatingDAO {
    EnergyRating createEnergyRating(EnergyRating energyRating);
    EnergyRating findEnergyRating(Long energyRatingId);
    Collection<EnergyRating> getEnergyRatings();
}
