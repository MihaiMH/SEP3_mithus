package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.PostStatusDAO;
import dk.via.mithus.Shared.PostStatus;
import dk.via.mithus.repositories.PostStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class PostStatusDAOImpl implements PostStatusDAO {
    @Autowired
    private PostStatusRepository postStatusRepository;

    @Override
    public PostStatus createPostStatus(PostStatus postStatus) {
        return postStatusRepository.save(postStatus);
    }

    @Override
    public PostStatus findPostStatus(String postStatusId) {
        return postStatusRepository.findById(Integer.parseInt(postStatusId)).orElse(null);
    }

    @Override
    public Collection<PostStatus> getPostStatuses() {
        return postStatusRepository.findAll();
    }
}
