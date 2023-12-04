package services;

import dk.via.mithus.DAOInterfaces.ChatDAO;
import dk.via.mithus.DAOInterfaces.PostDAO;
import dk.via.mithus.DAOInterfaces.UserDAO;
import dk.via.mithus.Shared.Post;
import dk.via.mithus.mappers.ChatMapper;
import dk.via.mithus.protobuf.*;
import dk.via.mithus.protobuf.Void;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@GRpcService
public class ChatService extends ChatServiceGrpc.ChatServiceImplBase {
    @Autowired
    private ChatDAO chatDAO;
    @Autowired
    private PostDAO postDAO;
    @Autowired
    private UserDAO userDAO;

    public ChatService() {}

    @Override
    public void createChat(ChatCreation request, StreamObserver<Chat> responseObserver) {
        Post foundPost = postDAO.findPost(request.getPostId());
        dk.via.mithus.Shared.Message messageToCreate = new dk.via.mithus.Shared.Message(
                request.getMessage().getBody(),
                request.getMessage().getTime()
        );
        dk.via.mithus.Shared.User user = userDAO.findUser(request.getMessage().getUserId());
        messageToCreate.setUser(user);
        dk.via.mithus.Shared.Message messageCreated = chatDAO.sendMessage(messageToCreate);

        Collection<dk.via.mithus.Shared.Message> messages = new ArrayList<>();
        messages.add(messageCreated);

        dk.via.mithus.Shared.Chat chatToBeCreated = new dk.via.mithus.Shared.Chat(
                messages,
                foundPost
        );

        dk.via.mithus.Shared.Chat chatCreated = chatDAO.createChat(chatToBeCreated);
        responseObserver.onNext(ChatMapper.mapProto(chatCreated));
        responseObserver.onCompleted();
    }

    @Override
    public void getChat(ChatId request, StreamObserver<Chat> responseObserver) {
        dk.via.mithus.Shared.Chat foundChat = chatDAO.getChat(request.getChatId());

        responseObserver.onNext(ChatMapper.mapProto(foundChat));
        responseObserver.onCompleted();
    }

    @Override
    public void getChats(UserId request, StreamObserver<Chats> responseObserver) {
        Collection<dk.via.mithus.Shared.Chat> chats = chatDAO.getChats(request.getUserId());

        Collection<Chat> chatCollection = new ArrayList<>();

        for (dk.via.mithus.Shared.Chat chat : chats) {
            chatCollection.add(ChatMapper.mapProto(chat));
        }

        Chats chatsResponse = Chats.newBuilder()
                .addAllChats(chatCollection)
                .build();

        responseObserver.onNext(chatsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void sendMessage(MessageCreation request, StreamObserver<Void> responseObserver) {
        dk.via.mithus.Shared.Chat chat = chatDAO.getChat(request.getChatId());
        dk.via.mithus.Shared.User user = userDAO.findUser(request.getMessage().getUserId());

        dk.via.mithus.Shared.Message message = new dk.via.mithus.Shared.Message(
                request.getMessage().getBody(),
                request.getMessage().getTime()
        );
        message.setUser(user);
        dk.via.mithus.Shared.Message messageCreated = chatDAO.sendMessage(message);

        chat.addMessage(messageCreated);
        chatDAO.updateChat(chat);
        responseObserver.onNext(Void.newBuilder().build());
        responseObserver.onCompleted();
    }
}
