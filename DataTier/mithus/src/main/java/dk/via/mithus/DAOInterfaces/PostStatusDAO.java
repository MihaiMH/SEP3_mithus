package dk.via.mithus.DAOInterfaces;

import dk.via.mithus.Shared.PostStatus;
import dk.via.mithus.Shared.PostStatuses;

import java.util.Collection;

public interface PostStatusDAO {
    PostStatus findPostStatus(Long postStatusId);
    PostStatuses getPostStatuses();
}
