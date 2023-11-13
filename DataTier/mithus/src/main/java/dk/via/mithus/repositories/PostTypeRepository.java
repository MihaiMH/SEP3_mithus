package dk.via.mithus.repositories;

import dk.via.mithus.Shared.PostType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTypeRepository extends JpaRepository<PostType, Integer> {
}
