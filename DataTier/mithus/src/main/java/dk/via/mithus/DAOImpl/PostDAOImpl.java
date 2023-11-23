package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.PostDAO;
import dk.via.mithus.Shared.Post;
import dk.via.mithus.Shared.PostStatus;
import dk.via.mithus.Shared.PostStatuses;
import dk.via.mithus.repositories.PostRepository;
import dk.via.mithus.repositories.PostStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Repository
public class PostDAOImpl implements PostDAO {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private PostStatusRepository postStatusRepository;

    public PostDAOImpl() {}

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Collection<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post findPost(Long postId) {
        return postRepository.findById(postId).orElse(null);
    }

    @Override
    public void deletePost(Long postId) {
        Optional<Post> post = postRepository.findById(postId);
        Optional<PostStatus> status = postStatusRepository.findById(3L);
        if (post.isPresent()) {
            post.get().setStatus(status.get());
            postRepository.save(post.get());
        }
    }

    @Override
    public Post updatePost(Post post) {
        Optional<Post> foundPost = postRepository.findById(post.getId());
        if (foundPost.isPresent()) {
            Post postToUpdate = foundPost.get();
            postToUpdate.setTitle(post.getTitle());
            postToUpdate.setDescription(post.getDescription());
            postToUpdate.setArea(post.getArea());
            postToUpdate.setMaxTenants(post.getMaxTenants());
            postToUpdate.setType(post.getType());
            postToUpdate.setEnergyRating(post.getEnergyRating());
            postToUpdate.setCost(post.getCost());
            postToUpdate.setAddress(post.getAddress());
            postToUpdate.setAmenities(post.getAmenities());
            postToUpdate.setImages(post.getImages());
            postToUpdate.setCreationDate(post.getCreationDate());
            postToUpdate.setStatus(post.getStatus());
            return postRepository.save(postToUpdate);
        }

        return null;
    }
}
