package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.PostStatusDAO;
import dk.via.mithus.Shared.PostStatus;
import dk.via.mithus.Shared.PostStatuses;
import dk.via.mithus.Shared.Role;
import dk.via.mithus.Shared.Roles;
import dk.via.mithus.repositories.PostStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class PostStatusDAOImpl implements PostStatusDAO {
    @Autowired
    private PostStatusRepository postStatusRepository;

    @Override
    public PostStatus findPostStatus(Long postStatusId) {
        return postStatusRepository.findById(postStatusId).orElse(null);
    }

    @Override
    public PostStatuses getPostStatuses() {
        Collection<PostStatus> postStatuses = postStatusRepository.findAllByOrderByIdAsc();
        PostStatus[] postStatusesArray = postStatuses.toArray(new PostStatus[0]);
        return new PostStatuses(postStatusesArray[0], postStatusesArray[1], postStatusesArray[2], postStatusesArray[3], postStatusesArray[4]);
    }
}
