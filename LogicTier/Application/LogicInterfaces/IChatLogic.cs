using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IChatLogic
{
    public Task<Chat> CreateChatAsync(CreateChatDTO chat);
    public Task SendMessageAsync(SendMessageDTO message, long chatId);
    public Task<Chat> GetMessagesByChatAsync(long chatId);
    public Task<IEnumerable<Chat>> GetChatsByUserAsync(long userID);
}