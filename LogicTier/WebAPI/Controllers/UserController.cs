using Application.LogicInterfaces;
using Dk.Via.Mithus.Protobuf;
using Domain.DTOs;
using Microsoft.AspNetCore.Mvc;
using Role = Domain.Models.Role;
using User = Domain.Models.User;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class UserController : ControllerBase
{
    private readonly IUserLogic userLogic;

    public UserController(IUserLogic userLogic)
    {
        this.userLogic = userLogic;
    }

    [Route("logIn")]
    [HttpPost]
    public async Task<ActionResult<User>> LogInAsync([FromBody] LoginDTO dto)
    {
        try
        {
            User user = await userLogic.LogInAsync(dto);
            return Created($"/users/{user.ID}", user);
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
}