package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.Chat;
import dk.via.mithus.Shared.Message;

import java.util.Collection;

public interface ChatDAO {
    Chat createChat(Chat chat);

    Chat getChat(Long id);

    Message sendMessage(Message message);

    Message getMessage(Long id);

    Collection<Chat> getChats(Long postId);

    void updateChat(Chat chat);
}
