package dk.mithus.repositories;

import dk.mithus.Shared.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
    Collection<String> findByPostId(Long id);
}
