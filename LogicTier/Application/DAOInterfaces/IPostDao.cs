using Domain.Models;

namespace Application.DAOInterfaces;

public interface IPostDao
{
    public Task<Post> CreatePostAsync(Post post);
}