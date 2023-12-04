package dk.via.mithus.mappers;

import dk.via.mithus.protobuf.Chat;
import dk.via.mithus.protobuf.Message;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ChatMapper {
    public static Chat mapProto(dk.via.mithus.Shared.Chat chat) {
        return Chat.newBuilder()
                .setId(chat.getId())
                .setPost(PostMapper.mapProto(chat.getPost()))
                .addAllMessages(mapMessagesProto(chat.getMessages()))
                .build();
    }

    public static Message mapMessageProto(dk.via.mithus.Shared.Message message) {
        return Message.newBuilder()
                .setId(message.getId())
                .setUserId(message.getUser().getId())
                .setBody(message.getBody())
                .setTime(message.getTime().toString())
                .build();
    }

    public static Collection<Message> mapMessagesProto(Collection<dk.via.mithus.Shared.Message> messages) {
        Collection<Message> messageCollection = new ArrayList<>();

        for (dk.via.mithus.Shared.Message message : messages) {
            messageCollection.add(mapMessageProto(message));
        }

        return messageCollection;
    }
}
