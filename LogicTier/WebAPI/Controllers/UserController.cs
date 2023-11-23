using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using System.Text;
using Application.LogicInterfaces;
using Dk.Via.Mithus.Protobuf;
using Domain.DTOs;
using Microsoft.AspNetCore.Mvc;
using Microsoft.IdentityModel.Tokens;
using JwtRegisteredClaimNames = Microsoft.IdentityModel.JsonWebTokens.JwtRegisteredClaimNames;
using Role = Domain.Models.Role;
using User = Domain.Models.User;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UserController : ControllerBase
{
    private readonly IUserLogic userLogic;
    private readonly IConfiguration config;

    public UserController(IUserLogic userLogic, IConfiguration config)
    {
        this.userLogic = userLogic;
        this.config = config;
    }

    [Route("logIn")]
    [HttpPost]
    public async Task<ActionResult> LogInAsync([FromBody] LoginDTO dto)
    {
        try
        {
            User user = await userLogic.LogInAsync(dto);
            string token = GenerateJwt(user);
            return Created($"/users/{user.ID}", token);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("register")]
    [HttpPost]
    public async Task<ActionResult<User>> RegisterAsync([FromBody] RegisterDTO dto)
    {
        try
        {
            User user = await userLogic.RegisterAsync(dto);
            return Created($"/users/{user.ID}", user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("getRoles")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Role>>> GetRolesAsync()
    {
        try
        {
            IEnumerable<Role> roles = await userLogic.GetRolesAsync();
            return Created($"/roles", roles);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("setUserStatus")]
    [HttpPatch]
    public async Task<ActionResult> SetUserStatusAsync([FromQuery] int userId, [FromQuery] int roleId)
    {
        try
        {
            await userLogic.SetUserStatusAsync(userId, roleId);
            return StatusCode(200);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("Users")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<User>>> GetUsersAsync()
    {
        try
        {
            IEnumerable<User> users = await userLogic.GetUsersAsync();
            return Created("/users", users);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("UsersById")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<User>>> GetUserByIdAsync([FromQuery] int id)
    {
        try
        {
            User user = await userLogic.GetUserByIdAsync(id);
            return Created($"/users/{id}", user);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }


    private List<Claim> GenerateClaims(User user)
    {
        var claims = new[]
        {
            new Claim(JwtRegisteredClaimNames.Sub, config["Jwt:Subject"]),
            new Claim(JwtRegisteredClaimNames.Jti, Guid.NewGuid().ToString()),
            new Claim(JwtRegisteredClaimNames.Iat, DateTime.UtcNow.ToString()),
            new Claim(ClaimTypes.Email, user.Email),
            new Claim(ClaimTypes.Role, user.Role.Name),
            new Claim("FirstName", user.FirstName),
            new Claim("LastName", user.FirstName),
            new Claim("ID", user.ID.ToString())
        };
        return claims.ToList();
    }

    private string GenerateJwt(User user)
    {
        List<Claim> claims = GenerateClaims(user);

        SymmetricSecurityKey key = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(config["Jwt:Key"]));
        SigningCredentials signIn = new SigningCredentials(key, SecurityAlgorithms.HmacSha512);

        JwtHeader header = new JwtHeader(signIn);

        JwtPayload payload = new JwtPayload(
            config["Jwt:Issuer"],
            config["Jwt:Audience"],
            claims,
            null,
            DateTime.UtcNow.AddMinutes(60));

        JwtSecurityToken token = new JwtSecurityToken(header, payload);

        string serializedToken = new JwtSecurityTokenHandler().WriteToken(token);
        return serializedToken;
    }
}