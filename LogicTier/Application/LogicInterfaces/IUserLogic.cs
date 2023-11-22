using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    public Task<User> LogInAsync(LoginDTO dto);
    public Task<User> RegisterAsync(RegisterDTO dto);

    public Task SetUserStatusAsync(int userId, int roleId);

    public Task<IEnumerable<Role>> GetRolesAsync();
}

