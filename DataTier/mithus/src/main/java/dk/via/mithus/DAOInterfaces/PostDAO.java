package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.Post;

import java.util.Collection;

public interface PostDAO {
    Post createPost(Post post);
    Collection<Post> getPosts();
//    Collection<Post> getPostsByUserId(String userId);
//    Collection<Post> getPostsByUser(String email);
    Post findPost(String postId);
    void deletePost(String postId);
    void updatePost(Post post);
}
