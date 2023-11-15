using System.Globalization;
using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.LogicImplementations;

public class ChatLogic : IChatLogic
{
    private readonly IChatDAO chatDao;

    public ChatLogic(IChatDAO chatDao)
    {
        this.chatDao = chatDao;
    }


    public async Task<Chat> CreateChatAsync(CreateChatDTO dto)
    {
        Chat chat = new Chat()
        {
            PostID = dto.PostID,
            Messages = new[] { dto.Message }
        };

        return await chatDao.CreateChatAsync(chat);
    }

    public async Task SendMessageAsync(SendMessageDTO dto, long chatId)
    {
        Message message = new Message
        {
            Text = dto.Text,
            Time = DateTime.Now.ToString(new CultureInfo("en-us")),
            UserID = dto.UserID
        };
        await chatDao.SendMessageAsync(message, chatId);
    }

    public async Task<Chat> GetMessagesByChatAsync(long chatId)
    {
        return await chatDao.GetMessagesByChatAsync(chatId);
    }

    public async Task<IEnumerable<Chat>> GetChatsByUserAsync(long userID)
    {
        return await chatDao.GetChatsByUserAsync(userID);
    }
}