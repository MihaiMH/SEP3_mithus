package dk.via.mithus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.*;

@Configuration
public class ServerConfig {
    @Bean
    public PostService getPostService() {
        return new PostService();
    }

    @Bean
    public ChatService getChatService() {
        return new ChatService();
    }

    @Bean
    public UserService getUserService() {
        return new UserService();
    }
}
