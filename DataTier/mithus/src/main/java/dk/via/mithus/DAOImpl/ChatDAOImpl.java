package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.ChatDAO;
import dk.via.mithus.Shared.Chat;
import dk.via.mithus.Shared.Message;
import dk.via.mithus.repositories.ChatRepository;
import dk.via.mithus.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public class ChatDAOImpl implements ChatDAO {
    @Autowired
    private ChatRepository chatRepository;
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public Chat getChat(Long id) {
        return chatRepository.findById(id).orElse(null);
    }

    @Override
    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Collection<Chat> getChats(Long userId) {
        return messageRepository.findAllChatsByUserId(userId);
    }

    @Override
    public void updateChat(Chat chat) {
        chatRepository.save(chat);
    }
}
