package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.CostDAO;
import dk.via.mithus.Shared.Cost;
import dk.via.mithus.repositories.CostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class CostDAOImpl implements CostDAO {
    @Autowired
    private CostRepository costRepository;

    @Override
    public Cost createCost(Cost cost) {
        return costRepository.save(cost);
    }
}
