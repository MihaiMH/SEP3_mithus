using Domain.Models;

namespace Application.DAOInterfaces;

public interface IUserDAO
{
    public Task<User> LoginAsync(User user);
    public Task<User> RegisterAsync(User user);
}