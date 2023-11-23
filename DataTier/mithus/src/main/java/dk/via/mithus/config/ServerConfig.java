package dk.via.mithus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.*;

@Configuration
public class ServerConfig {
    @Bean public AddressService getAddressService() {
        return new AddressService();
    }

    @Bean public AmenityService getAmenityService() {
        return new AmenityService();
    }

    @Bean public CostService getCostService() {
        return new CostService();
    }

    @Bean public PostService getPostService() {
        return new PostService();
    }

    @Bean public ChatService getChatService() {
      return new ChatService();
    }

    @Bean public EnergyRatingService getEnergyRatingService() {
      return new EnergyRatingService();
    }

    @Bean public HousingTypeService getHousingTypeService() {
      return new HousingTypeService();
    }

    @Bean public PostStatusService getPostStatusService() {
      return new PostStatusService();
    }

    @Bean public UserService getUserService() {
      return new UserService();
    }
}
