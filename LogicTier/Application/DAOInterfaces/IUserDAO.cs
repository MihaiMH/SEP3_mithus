using Domain.Models;

namespace Application.DAOInterfaces;

public interface IUserDAO
{
    public Task<User> LoginAsync(User user);
    public Task<User> RegisterAsync(User user);
    public Task SetUserStatusAsync(int userId, int roleId);

    public Task<IEnumerable<Role>> GetRolesAsync();

    public Task<User> GetUserByIdAsync(int userId);

    public Task<IEnumerable<User>> GetUsersAsync();

    public Task<User> UpdateUserAsync(User user);
}