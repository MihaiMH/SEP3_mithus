using System.Net.Http.Json;
using System.Security.Claims;
using System.Text;
using System.Text.Json;
using Domain.DTOs;
using Domain.Models;
using HttpClients.ClientInterfaces;
using Microsoft.JSInterop;

namespace HttpClients.ClientImplementations;

public class UserHttpClient : IUserService
{
    private readonly HttpClient httpClient;
    private readonly IJSRuntime jsRuntime;
    public static string? Jwt { get; private set; } = "";
    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }

    public UserHttpClient(HttpClient httpClient, IJSRuntime jsRuntime)
    {
        this.httpClient = httpClient;
        this.jsRuntime = jsRuntime;
    }

    public async Task LogInAsync(LoginDTO dto)
    {
        HttpResponseMessage responseMessage = await httpClient.PostAsJsonAsync("/User/login", dto);

        string result = await responseMessage.Content.ReadAsStringAsync();
        if (!responseMessage.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        
        string token = result;
        Jwt = token;
        await CacheUserAsync(Jwt);
        ClaimsPrincipal principal = CreateClaimsPrincipal();

        OnAuthStateChanged.Invoke(principal);
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
        string pula = $"/User/setUserStatus?userId={userId}&roleId={roleId}";
        HttpResponseMessage responseMessage = await httpClient.PutAsync(pula, null);
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }

    public async Task<IEnumerable<User>> GetAllUsersAsync()
    {
        string uri = "/User/Users";
        HttpResponseMessage response = await httpClient.GetAsync(uri);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
        IEnumerable<User> users = JsonSerializer.Deserialize<IEnumerable<User>>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }
    public async Task<User> GetUserByIdAsync(int id)
    {
        HttpResponseMessage response = await httpClient.GetAsync($"/User/UsersById?id={id}");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }
        User users = JsonSerializer.Deserialize<User>(content, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return users;
    }
    public async Task UpdateUserAsync(UpdateUserDTO dto)
    {
        string dtoAsJson = JsonSerializer.Serialize(dto);
        StringContent body = new StringContent(dtoAsJson, Encoding.UTF8, "application/json");
        
        HttpResponseMessage responseMessage =
            await httpClient.PatchAsync("/User/UpdateUser", body);
        if (!responseMessage.IsSuccessStatusCode)
        {
            string content = await responseMessage.Content.ReadAsStringAsync();
            throw new Exception(content);
        }
    }
    public async Task LogoutAsync()
    {
        await ClearUserFromCacheAsync(); // remove the user object from browser cache
        Jwt = null;
        ClaimsPrincipal principal = new();
        OnAuthStateChanged.Invoke(principal);
        
    }

    public async Task<ClaimsPrincipal> GetAuthAsync()
    {
        Jwt = await GetUserFromCacheAsync();
        ClaimsPrincipal principal = CreateClaimsPrincipal();
        return principal;
    }

    private static IEnumerable<Claim> ParseClaimsFromJwt(string jwt)
    {
        string payload = jwt.Split('.')[1];
        byte[] jsonBytes = ParseBase64WithoutPadding(payload);
        Dictionary<string, object>? keyValuePairs = JsonSerializer.Deserialize<Dictionary<string, object>>(jsonBytes);
        return keyValuePairs!.Select(kvp => new Claim(kvp.Key, kvp.Value.ToString()!));
    }

    private static byte[] ParseBase64WithoutPadding(string base64)
    {
        switch (base64.Length % 4)
        {
            case 2:
                base64 += "==";
                break;
            case 3:
                base64 += "=";
                break;
        }

        return Convert.FromBase64String(base64);
    }

    private static ClaimsPrincipal CreateClaimsPrincipal()
    {
        if (string.IsNullOrEmpty(Jwt))
        {
            return new ClaimsPrincipal();
        }

        IEnumerable<Claim> claims = ParseClaimsFromJwt(Jwt);

        ClaimsIdentity identity = new(claims, "jwt");

        ClaimsPrincipal principal = new(identity);
        return principal;
    }
    
    private async Task CacheUserAsync(string jwt)
    {
        await jsRuntime.InvokeVoidAsync("sessionStorage.setItem", "currentUser", jwt);
    }

    private async Task ClearUserFromCacheAsync()
    {
        await jsRuntime.InvokeVoidAsync("sessionStorage.setItem", "currentUser", "");
    }
    
    private async Task<string?> GetUserFromCacheAsync()
    {
        string jwt = await jsRuntime.InvokeAsync<string>("sessionStorage.getItem", "currentUser");
        return jwt;
    }

}