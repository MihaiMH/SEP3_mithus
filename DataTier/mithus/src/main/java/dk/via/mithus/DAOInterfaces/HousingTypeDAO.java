package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.HousingType;

import java.util.Collection;

public interface HousingTypeDAO {
    HousingType findHousingType(Long postTypeId);
    Collection<HousingType> getHousingTypes();
}
