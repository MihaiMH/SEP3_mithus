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
//    @Query("SELECT a.id FROM Animal a WHERE a.id IN (SELECT DISTINCT a.id FROM AnimalPart ap WHERE ap.product.id = ?1)")
//    List<Long> findAnimalIdsByProductId(Long productId);
    @Query("SELECT c FROM Chat c WHERE EXISTS (SELECT 1 FROM c.messages m WHERE m.user.id=?1)")
    Collection<Chat> findAllChatsByUserId(Long userId);
}
