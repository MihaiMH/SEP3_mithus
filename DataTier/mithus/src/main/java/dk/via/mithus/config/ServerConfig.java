package dk.via.mithus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.PostService;
import services.UserService;

@Configuration
public class ServerConfig {
    @Bean public UserService getUserService() {
        return new UserService();
    }

    @Bean public PostService getPostService() {
        return new PostService();
    }
}
