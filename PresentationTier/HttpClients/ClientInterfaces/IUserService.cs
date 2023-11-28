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
    Task<IEnumerable<User>> GetAllUsersAsync();
    Task<User> GetUserByIdAsync(int id);
    Task UpdateUserAsync(UpdateUserDTO dto);
    public Task LogoutAsync();
    public Task<ClaimsPrincipal> GetAuthAsync();

    public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}