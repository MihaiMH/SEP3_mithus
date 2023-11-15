using Domain.DTOs;
using Domain.Models;

namespace Application.DAOInterfaces;

public interface IChatDAO
{
    public Task<Chat> CreateChatAsync(Chat chat);
    public Task SendMessageAsync(Message message, long chatId);
    public Task<Chat> GetMessagesByChatAsync(long chatId);
    public Task<IEnumerable<Chat>> GetChatsByUserAsync(long userID);
}