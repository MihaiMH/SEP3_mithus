package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.PostType;

import java.util.Collection;

public interface PostTypeDAO {
    PostType createPostType(PostType postType);
    PostType findPostType(String postTypeId);
    Collection<PostType> getPostTypes();
}
