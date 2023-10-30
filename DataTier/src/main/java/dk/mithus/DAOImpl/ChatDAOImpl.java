package dk.mithus.DAOImpl;

import dk.mithus.DAOInterfaces.ChatDAO;
import dk.mithus.Shared.Message;
import dk.mithus.repositories.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class ChatDAOImpl implements ChatDAO {
    @Autowired
    private ChatRepository chatRepository;

    @Override
    public void sendMessage(String message, String username, String postId) {
        chatRepository.save(new Message(message, username, postId));
    }

    @Override
    public Collection<String> getMessages(String postId) {
        return chatRepository.findByPostId(Long.parseLong(postId));
    }
}
