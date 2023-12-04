using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.ClientImplementations;

public class ChatHttpClient : IChatService
{
    private readonly HttpClient _httpClient;

    public ChatHttpClient(HttpClient httpClient)
    {
        _httpClient = httpClient;
    }

    public async Task<Chat> CreateChatAsync(CreateChatDTO dto)
    {
        HttpResponseMessage responseMessage = await _httpClient.PostAsJsonAsync("/Chat/createChat", dto);

        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Chat chat = JsonSerializer.Deserialize<Chat>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return chat;
    }

    public async Task SendMessageAsync(SendMessageDTO dto, long chatId)
    {

        HttpResponseMessage responseMessage = await _httpClient.PostAsJsonAsync($"/Chat/sendMessage?chatId={chatId}", dto);

        if (responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<Message> GetMessageByChat(long chatId)
    {
        string uri = "Chat/GetMessageByChatId";
        HttpResponseMessage responseMessage = await _httpClient.GetAsync(uri);
        string content = await responseMessage.Content.ReadAsStringAsync();

        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        Message message = JsonSerializer.Deserialize<Message>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return message;
    }

    public async Task<IEnumerable<Chat>> GetChatByUser(long userId)
    {
        string uri = $"/Chat/GetChatsByUserId?userId={userId}";
        HttpResponseMessage responseMessage = await _httpClient.GetAsync(uri);

        string content = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        IEnumerable<Chat> chats = JsonSerializer.Deserialize<IEnumerable<Chat>>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        
        return chats;
    }

    private static string ConstructQuery(SendMessageDTO dto, long chatId)
    {
        string query = "";
        if (dto != null)
        {
            query += $"?dto={dto}";
        }

        if (chatId != null)
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"chatId={chatId}";
        }

        return query;
    }
}