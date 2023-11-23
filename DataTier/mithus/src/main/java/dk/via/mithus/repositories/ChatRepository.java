package dk.via.mithus.repositories;

import dk.via.mithus.Shared.Chat;
import dk.via.mithus.Shared.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}
