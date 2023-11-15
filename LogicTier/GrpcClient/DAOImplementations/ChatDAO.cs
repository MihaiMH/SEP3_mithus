using Application.DAOInterfaces;
using Dk.Via.Mithus.Protobuf;
using Domain.DTOs;
using Google.Protobuf.Collections;
using MessageDomain = Domain.Models.Message;

namespace GrpcClient.DAOImplementations;

public class ChatDAO : IChatDAO
{
    private ChatService.ChatServiceClient chatService;

    public ChatDAO(ChatService.ChatServiceClient chatService)
    {
        this.chatService = chatService;
    }


    public Task<Domain.Models.Chat> CreateChatAsync(Domain.Models.Chat chat)
    {
        MessageDomain message = new MessageDomain();

        foreach (var msg in chat.Messages)
        {
            message = msg;
        }

        ChatCreation chatToBeCreated = new ChatCreation
        {
            PostId = chat.PostID,
            Message = new Dk.Via.Mithus.Protobuf.Message
            {
                UserId = message.UserID,
                Body = message.Text,
                Time = message.Time
            }
        };

        Chat chatProto = chatService.CreateChat(chatToBeCreated);

        List<MessageDomain> allMessages = new List<MessageDomain>();

        foreach (var msg in chatProto.Messages)
        {
            allMessages.Add(new MessageDomain
            {
                ID = msg.Id,
                UserID = msg.UserId,
                Time = msg.Time,
                Text = msg.Body
            });
        }

        Domain.Models.Chat receivedChat = new Domain.Models.Chat()
        {
            ID = chatProto.Id,
            Messages = allMessages,
            PostID = chatProto.Post.Id,
            PostName = chatProto.Post.Title
        };

        return Task.FromResult(receivedChat);
    }

    public Task SendMessageAsync(MessageDomain message, long chatId)
    {
        MessageCreation messageToBeSent = new MessageCreation()
        {
            ChatId = chatId,
            Message = new Message
            {
                Body = message.Text,
                Time = message.Time,
                UserId = message.UserID
            }
        };

        return Task.FromResult(chatService.SendMessage(messageToBeSent));
    }

    public Task<Domain.Models.Chat> GetMessagesByChatAsync(long chatId)
    {
        Chat chatProto = chatService.GetChat(new ChatId
        {
            ChatId_ = chatId
        });

        List<MessageDomain> allMessages = new List<MessageDomain>();

        foreach (var msg in chatProto.Messages)
        {
            allMessages.Add(new MessageDomain
            {
                ID = msg.Id,
                UserID = msg.UserId,
                Time = msg.Time,
                Text = msg.Body
            });
        }

        Domain.Models.Chat receivedChat = new Domain.Models.Chat()
        {
            ID = chatProto.Id,
            Messages = allMessages,
            PostID = chatProto.Post.Id,
            PostName = chatProto.Post.Title
        };

        return Task.FromResult(receivedChat);
    }

    public async Task<IEnumerable<Domain.Models.Chat>> GetChatsByUserAsync(long userID)
    {
        Chats chatsProto = await chatService.GetChatsAsync(new UserId
        {
            UserId_ = userID
        });

        RepeatedField<Chat> foundChatsProto = chatsProto.Chats_;

        List<Domain.Models.Chat> chats = new List<Domain.Models.Chat>();

        foreach (var chat in foundChatsProto)
        {
            List<MessageDomain> allMessages = new List<MessageDomain>();

            foreach (var msg in chat.Messages)
            {
                allMessages.Add(new MessageDomain
                {
                    ID = msg.Id,
                    UserID = msg.UserId,
                    Time = msg.Time,
                    Text = msg.Body
                });
            }

            chats.Add(new Domain.Models.Chat()
            {
                ID = chat.Id,
                Messages = allMessages,
                PostID = chat.Post.Id,
                PostName = chat.Post.Description
            });
        }

        return chats;
    }
}