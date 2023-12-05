package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.AddressDAO;
import dk.via.mithus.Shared.Address;
import dk.via.mithus.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class AddressDAOImpl implements AddressDAO {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }
}
