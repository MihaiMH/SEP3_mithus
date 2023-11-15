package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.Amenity;

import java.util.Collection;

public interface AmenityDAO {
    Amenity createAmenity(Amenity amenity);
    Amenity findAmenity(Long amenityId);
    Collection<Amenity> getAmenities();
}
