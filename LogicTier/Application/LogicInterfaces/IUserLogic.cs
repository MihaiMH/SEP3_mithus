using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IUserLogic
{
    public Task<User> LogInAsync(LoginDTO dto);
    public Task<User> RegisterAsync(RegisterDTO dto);
}