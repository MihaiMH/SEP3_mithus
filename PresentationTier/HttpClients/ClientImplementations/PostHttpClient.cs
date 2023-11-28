using System.Net.Http.Json;
using System.Text;
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

    public async Task<Post> CreateCommentAsync(PostCreationDTO dto)
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
    

    public async Task<IEnumerable<Post>> GetAllPostsAsync()
    {
        string uri = "/Post/getAllPosts";
        HttpResponseMessage response = await httpClient.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        IEnumerable<Post> users = JsonSerializer.Deserialize<IEnumerable<Post>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }

    public async Task DeletePostAsync(long id)
    {
        HttpResponseMessage responseMessage = await httpClient.DeleteAsync($"/Post/deletePost?id={id}");
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task SetPostStatusAsync(long postId, long statusId)
    {
        string uri = new string($"/Post/setPostStatus?postId={postId}&statusId={statusId}");

        HttpResponseMessage responseMessage = await httpClient.PutAsync(uri, null);
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task UpdatePostAsync(PostCreationDTO dto)
    {
        string dtoAsJson = JsonSerializer.Serialize(dto);
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        
        HttpResponseMessage responseMessage =
            await httpClient.PutAsync("/Post/setPostStatus", body);
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<Post> GetPostByPostIdAsync(long id)
    {
        HttpResponseMessage response = await httpClient.GetAsync($"/post/GetPostByPostId?id={id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        Post users = JsonSerializer.Deserialize<Post>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }

    public async Task<IEnumerable<PostStatus>> GetPostStatusesAsync()
    {
        string uri = "/Post/GetPostStatuses";
        HttpResponseMessage response = await httpClient.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        IEnumerable<PostStatus> users = JsonSerializer.Deserialize<IEnumerable<PostStatus>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }

    public async Task<IEnumerable<EnergyRating>> GetEnergyRatingsAsync()
    {
        string uri = "/Post/GetEnergyRatings";
        HttpResponseMessage response = await httpClient.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        IEnumerable<EnergyRating> users = JsonSerializer.Deserialize<IEnumerable<EnergyRating>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }

    public async Task<IEnumerable<HousingType>> GetHousingTypesAsync()
    {
        string uri = "/Post/GetHousingTypes";
        HttpResponseMessage response = await httpClient.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        IEnumerable<HousingType> users = JsonSerializer.Deserialize<IEnumerable<HousingType>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }
    private static string ConstructQuery(long postId, long statusId)
    {
        string query = "";
        if (postId != null)
        {
            query += $"?postId={postId}";
        }

        if (statusId != null)
        {
            query += string.IsNullOrEmpty(query) ? "?" : "&";
            query += $"statusId={statusId}";
        }

        return query;
    }
}