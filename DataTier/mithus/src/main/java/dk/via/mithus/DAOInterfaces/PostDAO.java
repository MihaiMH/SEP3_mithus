package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.Post;

import java.util.Collection;

public interface PostDAO {
    Post createPost(Post post);
    Collection<Post> getPosts();
    Post findPost(Long postId);
    void deletePost(Long postId);
    Post updatePost(Post post);
}
