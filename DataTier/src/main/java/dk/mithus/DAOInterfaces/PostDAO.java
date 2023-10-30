package dk.mithus.DAOInterfaces;

import dk.mithus.Shared.Post;

import java.util.Collection;

public interface PostDAO {
    Post registerPost(Post post);
    Collection<Post> getPosts();
    Collection<Post> getPostsByUser(String username);
    Post findPost(String postId);
    void deletePost(String postId);
    void updatePost(Post post);
}
