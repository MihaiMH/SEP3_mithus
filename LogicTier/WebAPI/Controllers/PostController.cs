using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class PostController : ControllerBase
{
    private readonly IPostLogic postLogic;

    public PostController(IPostLogic postLogic)
    {
        this.postLogic = postLogic;
    }

    [Route("createPost")]
    [HttpPost]
    public async Task<ActionResult<Post>> CreateCommentAsync(PostCreationDTO dto)
    {
        try
        {
            Post post = await postLogic.CreatePostAsync(dto);
            return Created($"/posts/{post.ID}", post);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}