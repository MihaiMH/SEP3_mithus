package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.PostStatus;

import java.util.Collection;

public interface PostStatusDAO {
    PostStatus createPostStatus(PostStatus postStatus);
    PostStatus findPostStatus(String postStatusId);
    Collection<PostStatus> getPostStatuses();
}
