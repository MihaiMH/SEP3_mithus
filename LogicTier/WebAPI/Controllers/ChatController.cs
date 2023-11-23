using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class ChatController : ControllerBase
{
    private readonly IChatLogic chatLogic;

    public ChatController(IChatLogic chatLogic)
    {
        this.chatLogic = chatLogic;
    }

    [Route("createChat")]
    [HttpPost]
    public async Task<ActionResult<Chat>> CreateChatAsync([FromBody] CreateChatDTO dto)
    {
        try
        {
            Chat chat = await chatLogic.CreateChatAsync(dto);
            return Created($"/chats/{chat.ID}", chat);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("sendMessage")]
    [HttpPost]
    public async Task<ActionResult> SendMessageAsync([FromBody] SendMessageDTO dto, [FromQuery] long chatId)
    {
        try
        {
            await chatLogic.SendMessageAsync(dto, chatId);
            return StatusCode(200);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("GetMessagesByChatId")]
    [HttpGet]
    public async Task<ActionResult<Chat>> GetMessagesByChat([FromQuery] long chatId)
    {
        try
        {
            Chat chat = await chatLogic.GetMessagesByChatAsync(chatId);
            return Ok(chat);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("GetChatsByUserId")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Chat>>> GetChatsByUser([FromQuery] long userId)
    {
        try
        {
            IEnumerable<Chat> chats = await chatLogic.GetChatsByUserAsync(userId);
            return Created($"/{userId}/chats", chats);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}