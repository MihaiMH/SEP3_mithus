using System.Net.Http.Json;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;

namespace HttpClients.ClientImplementations;

public class PostHttpClient : IPostService
{
    private readonly HttpClient httpClient;

    public PostHttpClient(HttpClient httpClient)
    {
        this.httpClient = httpClient;
    }

    public async Task<Post> CreatePostAsync(PostCreationDTO dto)
    {
        HttpResponseMessage responseMessage = await httpClient.PostAsJsonAsync("/Post/createPost", dto);
        
        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        Post post = JsonSerializer.Deserialize<Post>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;

        return post;
    }
}