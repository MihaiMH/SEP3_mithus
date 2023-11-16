package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.HousingTypeDAO;
import dk.via.mithus.Shared.HousingType;
import dk.via.mithus.repositories.HousingTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class HousingTypeDAOImpl implements HousingTypeDAO {
    @Autowired
    private HousingTypeRepository housingTypeRepository;

    @Override
    public HousingType createHousingType(HousingType housingType) {
        return housingTypeRepository.save(housingType);
    }

    @Override
    public HousingType findHousingType(Long postTypeId) {
        return housingTypeRepository.findById(postTypeId).orElse(null);
    }

    @Override
    public Collection<HousingType> getHousingTypes() {
        return housingTypeRepository.findAll();
    }
}