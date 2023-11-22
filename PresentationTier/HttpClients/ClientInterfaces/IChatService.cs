using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IChatService
{
    Task<Chat> CreateChatAsync(CreateChatDTO dto);
    Task SendMessageAsync(SendMessageDTO dto, long chatId);
    Task<Message> GetMessageByChat(long chatId);
    Task<IEnumerable<Chat>> GetChatByUser(long userId);
    
}