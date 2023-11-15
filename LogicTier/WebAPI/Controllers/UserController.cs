using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

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
}