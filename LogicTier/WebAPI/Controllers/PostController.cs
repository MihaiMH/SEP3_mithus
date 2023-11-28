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
            Domain.Models.Post post = await postLogic.CreatePostAsync(dto);
            return Created($"/posts/{post.ID}", post);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("getAllPosts")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<Post>>> GetAllPostsAsync()
    {
        try
        {
            IEnumerable<Post> posts = await postLogic.GetAllPostsAsync();
            return Created($"/posts/all", posts);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("deletePost")]
    [HttpDelete]
    public async Task<ActionResult> DeletePostAsync([FromQuery] long id)
    {
        try
        {
            await postLogic.DeletePostAsync(id);
            return StatusCode(200);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("setPostStatus")]
    [HttpPut]
    public async Task<ActionResult> SetPostStatusAsync([FromQuery] long postId, [FromQuery] long statusId)
    {
        try
        {
            await postLogic.SetPostStatusAsync(postId, statusId);
            return StatusCode(200);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("updatePost")]
    [HttpPut]
    public async Task<ActionResult> UpdatePostAsync([FromBody] PostCreationDTO dto)
    {
        try
        {
            await postLogic.UpdatePostAsync(dto);
            return StatusCode(200);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("GetPostByPostId")]
    [HttpGet]
    public async Task<ActionResult<Post>> GetPostByPostIdAsync([FromQuery] long id)
    {
        try
        {
            Post post = await postLogic.GetPostByPostIdAsync(id);
            return Created($"/posts/{post.ID}", post);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("GetPostStatuses")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<PostStatus>>> GetPostStatusesAsync()
    {
        try
        {
            IEnumerable<PostStatus> postStatuses = await postLogic.GetPostStatusesAsync();
            return Created($"/postStatuses", postStatuses);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [Route("GetEnergyRatings")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<EnergyRating>>> GetEnergyRatingsAsync()
    {
        try
        {
            IEnumerable<EnergyRating> energyRatings = await postLogic.GetEnergyRatingsAsync();
            return Created($"/energyRatings", energyRatings);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
    [Route("GetHousingTypes")]
    [HttpGet]
    public async Task<ActionResult<IEnumerable<HousingType>>> GetHousingTypesAsync()
    {
        try
        {
            IEnumerable<HousingType> housingTypes = await postLogic.GetHousingTypesAsync();
            return Created($"/housingTypes", housingTypes);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
    
}