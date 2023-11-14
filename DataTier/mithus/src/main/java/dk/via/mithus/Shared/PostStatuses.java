package dk.via.mithus.Shared;

public class PostStatuses {
    public static PostStatus Available;
    public static PostStatus Reserved;
    public static PostStatus Hidden;
    public static PostStatus Denied;
    public static PostStatus Pending;

    public PostStatuses(PostStatus available, PostStatus reserved, PostStatus hidden, PostStatus denied, PostStatus pending) {
        Available = available;
        Reserved = reserved;
        Hidden = hidden;
        Denied = denied;
        Pending = pending;
    }

    public PostStatus getAvailable() {
        return Available;
    }

    public PostStatus getReserved() {
        return Reserved;
    }

    public PostStatus getHidden() {
        return Hidden;
    }

    public PostStatus getDenied() {
        return Denied;
    }

    public PostStatus getPending() {
        return Pending;
    }
}
