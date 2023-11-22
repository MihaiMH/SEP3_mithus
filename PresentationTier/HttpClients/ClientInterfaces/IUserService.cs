using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IUserService
{
    Task<User> LogInAsync(LoginDTO dto);
    Task<User> RegisterAsync(RegisterDTO dto);
    Task<IEnumerable<Role>> GetRolesAsync();
    Task SetUserStatusAsync(int userId, int roleId);
}