package dk.via.mithus.config;

import dk.via.mithus.Shared.EnergyRating;
import dk.via.mithus.Shared.HousingType;
import dk.via.mithus.Shared.PostStatus;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.repositories.EnergyRatingRepository;
import dk.via.mithus.repositories.HousingTypeRepository;
import dk.via.mithus.repositories.PostStatusRepository;
import dk.via.mithus.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HardcodedData implements ApplicationRunner {
    @Autowired
    private PostStatusRepository postStatusRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private HousingTypeRepository housingTypeRepository;
    @Autowired
    private EnergyRatingRepository energyRatingRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        roleRepository.save(new Role(1L, "Client"));
        roleRepository.save(new Role(2L, "Landlord"));
        roleRepository.save(new Role(3L, "Moderator"));
        roleRepository.save(new Role(4L, "Administrator"));
        roleRepository.save(new Role(5L, "Inactive"));
        roleRepository.save(new Role(6L, "Pending"));

        postStatusRepository.save(new PostStatus(1L, "Available"));
        postStatusRepository.save(new PostStatus(2L, "Reserved"));
        postStatusRepository.save(new PostStatus(3L, "Hidden"));
        postStatusRepository.save(new PostStatus(4L, "Denied"));
        postStatusRepository.save(new PostStatus(5L, "Pending"));

        housingTypeRepository.save(new HousingType(1L, "Penthouse"));
        housingTypeRepository.save(new HousingType(2L, "Studio"));
        housingTypeRepository.save(new HousingType(3L, "Duplex"));
        housingTypeRepository.save(new HousingType(4L, "1 Bedroom"));
        housingTypeRepository.save(new HousingType(5L, "Luxury"));

        energyRatingRepository.save(new EnergyRating(1L, "A"));
        energyRatingRepository.save(new EnergyRating(2L, "B"));
        energyRatingRepository.save(new EnergyRating(3L, "C"));
        energyRatingRepository.save(new EnergyRating(4L, "D"));
        energyRatingRepository.save(new EnergyRating(5L, "E"));
        energyRatingRepository.save(new EnergyRating(6L, "F"));
        energyRatingRepository.save(new EnergyRating(7L, "G"));
    }
}
