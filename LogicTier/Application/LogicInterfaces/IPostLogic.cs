using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IPostLogic
{
    public Task<Post> GetPostByPostIdAsync(long id);
    public Task UpdatePostAsync(PostCreationDTO dto);
    public Task SetPostStatusAsync(long id, int statusID);
    public Task DeletePostAsync(long id);
    
    public Task<Post> CreatePostAsync(PostCreationDTO dto);
    public Task<IEnumerable<Post>> GetAllPostsAsync();
}