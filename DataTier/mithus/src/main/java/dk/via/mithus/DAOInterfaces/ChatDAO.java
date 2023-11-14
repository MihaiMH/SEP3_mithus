package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.Message;

import java.util.Collection;

public interface ChatDAO {
    void sendMessage(String message, String username, String postId);
    Collection<Message> getMessages(Long postId);
}
