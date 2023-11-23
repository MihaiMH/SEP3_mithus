 using System.Net.Mail;
using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.LogicImplementations;

public class UserLogic : IUserLogic
{
    private readonly IUserDAO userDAO;

    public UserLogic(IUserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    public async Task<User> LogInAsync(LoginDTO dto)
    {
        User searchedUser = new User
        {
            Email = dto.Email
        };

        User foundUser = await userDAO.LoginAsync(searchedUser);

        if (foundUser.Password.Equals(dto.Password) && !foundUser.Email.Equals("404NOTFOUND"))
        {
            foundUser.Password = "NO PASSWORD FOR YOU";

            return foundUser;
        }

        throw new Exception("Wrong username or password");
    }

    public async Task<User> RegisterAsync(RegisterDTO dto)
    {
        ValidateData(dto);

        User user = new User()
        {
            Email = dto.Email,
            Password = dto.Password,
            FirstName = dto.FirstName,
            LastName = dto.LastName,
            Role = dto.Role
        };

        return await userDAO.RegisterAsync(user);
    }

    public async Task SetUserStatusAsync(int userId, int roleId)
    {
        await userDAO.SetUserStatusAsync(userId, roleId);
    }

    public async Task<IEnumerable<Role>> GetRolesAsync()
    {
        return await userDAO.GetRolesAsync();
    }

    private static void ValidateData(RegisterDTO dto)
    {
        string email = dto.Email;
        string password = dto.Password;
        string firstName = dto.FirstName;
        string lastName = dto.LastName;
        string role = dto.Role.Name;


        try
        {
            MailAddress mailAddress = new MailAddress(email);
        }
        catch (Exception e)
        {
            throw new Exception("Invalid email format");
        }

        if (string.IsNullOrWhiteSpace(password) || string.IsNullOrEmpty(password) || password.Contains(" ") ||
            password.Length > 15 || password.Length < 7)
        {
            throw new Exception("Password must be between 7 and 15 characters and can't contain spaces");
        }

        if (string.IsNullOrWhiteSpace(firstName) || string.IsNullOrEmpty(firstName) || firstName.Contains(" ") ||
            firstName.Length > 20 || firstName.Length < 1)
        {
            throw new Exception("First name must be between 1 and 20 characters and can't contain spaces");
        }

        if (string.IsNullOrWhiteSpace(lastName) || string.IsNullOrEmpty(lastName) || lastName.Contains(" ") ||
            lastName.Length > 20 || lastName.Length < 1)
        {
            throw new Exception("Last name must be between 1 and 20 characters and can't contain spaces");
        }

        if (string.IsNullOrWhiteSpace(role) || string.IsNullOrEmpty(role))
        {
            throw new Exception("The role can't be empty");
        }
    }
}