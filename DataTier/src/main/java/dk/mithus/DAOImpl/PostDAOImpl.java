package dk.mithus.DAOImpl;

import dk.mithus.DAOInterfaces.PostDAO;
import dk.mithus.Shared.Post;
import dk.mithus.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;

@Repository
public class PostDAOImpl implements PostDAO {
    @Autowired
    private PostRepository postRepository;

    public PostDAOImpl() {}

    @Override
    public Post registerPost(Post post) {
        post.setCreationDate(LocalDateTime.now());
        postRepository.save(post);
        return post;
    }

    @Override
    public Collection<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Collection<Post> getPostsByUser(String username) {
        return postRepository.getPostsByLandlordContains(username);
    }

    @Override
    public Post findPost(String postId) {
        return postRepository.findById(Long.parseLong(postId)).orElse(null);
    }

    @Override
    public void deletePost(String postId) {
        postRepository.deleteById(Long.parseLong(postId));
    }

    @Override
    public void updatePost(Post post) {

    }
}
