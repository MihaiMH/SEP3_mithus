package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.PostTypeDAO;
import dk.via.mithus.Shared.PostType;
import dk.via.mithus.repositories.PostTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class PostTypeDAOImpl implements PostTypeDAO {
    @Autowired
    private PostTypeRepository postTypeRepository;

    @Override
    public PostType createPostType(PostType postType) {
        return postTypeRepository.save(postType);
    }

    @Override
    public PostType findPostType(String postTypeId) {
        return postTypeRepository.findById(Integer.parseInt(postTypeId)).orElse(null);
    }

    @Override
    public Collection<PostType> getPostTypes() {
        return postTypeRepository.findAll();
    }
}
