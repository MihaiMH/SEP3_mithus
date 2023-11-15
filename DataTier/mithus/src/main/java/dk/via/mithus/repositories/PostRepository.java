package dk.via.mithus.repositories;

import dk.via.mithus.Shared.Image;
import dk.via.mithus.Shared.Post;
import dk.via.mithus.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
