package dk.via.mithus.DAOInterfaces;

import java.util.Collection;

public interface ChatDAO {
    void sendMessage(String message, String username, String postId);
    Collection<String> getMessages(String postId);
}
