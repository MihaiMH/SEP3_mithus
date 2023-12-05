package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.AmenityDAO;
import dk.via.mithus.Shared.Amenity;
import dk.via.mithus.repositories.AmenityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class AmenityDAOImpl implements AmenityDAO {
    @Autowired
    private AmenityRepository amenityRepository;

    @Override
    public Amenity createAmenity(Amenity amenity) {
        return amenityRepository.save(amenity);
    }
}
