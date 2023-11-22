using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.ClientImplementations;

public class UserHttpClient : IUserService
{
    private readonly HttpClient httpClient;

    public UserHttpClient(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public async Task<User> LogInAsync(LoginDTO dto)
    {
        HttpResponseMessage responseMessage = await httpClient.PostAsJsonAsync("/User/login", dto);
        
        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User post = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return post;
    }

    public async Task<User> RegisterAsync(RegisterDTO dto)
    {
        HttpResponseMessage responseMessage = await httpClient.PostAsJsonAsync("/User/register", dto);
        
        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        User post = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return post;
    }

    public async Task<IEnumerable<Role>> GetRolesAsync()
    {
        string uri = "/User/getRoles";
        HttpResponseMessage response = await httpClient.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        IEnumerable<Role> users = JsonSerializer.Deserialize<IEnumerable<Role>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }

    public async Task SetUserStatusAsync(int userId, int roleId)
    {
        StringContent query = new StringContent($"?userId={userId}&roleId={roleId}");
        HttpResponseMessage responseMessage =
            await httpClient.PatchAsync("/Post/setPostStatus", query);
        if (responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
}