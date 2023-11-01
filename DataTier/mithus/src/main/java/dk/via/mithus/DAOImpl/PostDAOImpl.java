package dk.via.mithus.DAOImpl;

import dk.via.mithus.DAOInterfaces.PostDAO;
import dk.via.mithus.Shared.Post;
import dk.via.mithus.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;

@Repository
public class PostDAOImpl implements PostDAO {
    @Autowired
    private PostRepository postRepository;

    public PostDAOImpl() {}

    @Override
    public Post createPost(Post post) {
        //post.setCreationDate(LocalDateTime.now());
        System.out.println(post.toString());
        postRepository.save(post);
        return post;
    }

    @Override
    public Collection<Post> getPosts() {
        return postRepository.findAll();
    }

//    @Override
//    public Collection<Post> getPostsByUser(String email) {
//        return postRepository.getPostsByLandlordContains(email);
//    }
//
//    @Override
//    public Collection<Post> getPostsByUserId(String userId) {
//        return postRepository.getPostsByLandlordId(UUID.fromString(userId));
//    }

    @Override
    public Post findPost(String postId) {
        return postRepository.findById(Integer.parseInt(postId)).orElse(null);
    }

    @Override
    public void deletePost(String postId) {
        postRepository.deleteById(Integer.parseInt(postId));
    }

    @Override
    public void updatePost(Post post) {

    }
}
