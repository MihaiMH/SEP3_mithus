using System.Security.Claims;
using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task LogInAsync(LoginDTO dto);
    Task<User> RegisterAsync(RegisterDTO dto);
    Task<IEnumerable<Role>> GetRolesAsync();
    Task SetUserStatusAsync(int userId, int roleId);
    public Task LogoutAsync();
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}