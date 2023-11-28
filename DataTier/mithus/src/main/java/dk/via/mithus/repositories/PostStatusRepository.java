package dk.via.mithus.repositories;

import dk.via.mithus.Shared.PostStatus;
import dk.via.mithus.Shared.PostStatuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PostStatusRepository extends JpaRepository<PostStatus, Long> {
    Collection<PostStatus> findAllByOrderByIdAsc();
}
