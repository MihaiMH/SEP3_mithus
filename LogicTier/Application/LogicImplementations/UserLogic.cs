using System.Net.Mail;
using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Identity;

namespace Application.LogicImplementations;

public class UserLogic : IUserLogic
{
    private readonly IUserDAO userDAO;
    private static readonly PasswordHasher<string> hasher = new PasswordHasher<string>();

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

        if (!foundUser.Email.Equals("404NOTFOUND") &&
            VerifyPassword(foundUser.Password, dto.Password))
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
            Password = HashPassword(dto.Password),
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

    public async Task<User> GetUserByIdAsync(int userId)
    {
        User user = await userDAO.GetUserByIdAsync(userId);
        return user;
    }

    public async Task<IEnumerable<User>> GetUsersAsync()
    {
        return await userDAO.GetUsersAsync();
    }

    public async Task<User> UpdateUserAsync(UpdateUserDTO dto)
    {
        ValidateData(dto);

        User user = new User()
        {
            Email = dto.Email,
            FirstName = dto.FirstName,
            ID = dto.ID,
            LastName = dto.LastName,
            Password = HashPassword(dto.Password)
        };

        return await userDAO.UpdateUserAsync(user);
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

    private static void ValidateData(UpdateUserDTO dto)
    {
        string email = dto.Email;
        string password = dto.Password;
        string firstName = dto.FirstName;
        string lastName = dto.LastName;


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
    }

    private static string HashPassword(string password)
    {
        string hashedPassword = hasher.HashPassword(null, password);

        return hashedPassword;
    }

    private static bool VerifyPassword(string hashedPassword, string providedPassword)
    {
        var passwordVerificationResult = hasher.VerifyHashedPassword(null, hashedPassword, providedPassword);

        return passwordVerificationResult == PasswordVerificationResult.Success;
    }
}