package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.ChatDAO;
import dk.via.mithus.Shared.Message;
import dk.via.mithus.repositories.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public class ChatDAOImpl implements ChatDAO {
    @Autowired
    private ChatRepository chatRepository;

    @Override
    public void sendMessage(String message, String username, String postId) {
    }

    @Override
    public Collection<Message> getMessages(String postId) {
        return chatRepository.findChatByPostId(Long.parseLong(postId));
    }
}
