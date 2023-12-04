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
    @Query("SELECT c FROM Chat c JOIN c.messages m JOIN c.post p WHERE p.landlord.id = ?1 OR m.user.id = ?1")
    Collection<Chat> findAllChatsByUserId(Long userId);
}
