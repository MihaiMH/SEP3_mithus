package dk.via.mithus.repositories;

import dk.via.mithus.Shared.Chat;
import dk.via.mithus.Shared.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    @Query("SELECT c FROM Chat c WHERE EXISTS (SELECT 1 FROM c.messages m WHERE m.user.id=?1)")
    Collection<Chat> findAllChatsByUserId(Long userId);
}
