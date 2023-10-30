package dk.mithus.repositories;

import dk.mithus.Shared.Post;
import dk.mithus.Shared.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Collection<Post> getPostsByLandlordContains(String username);
}
