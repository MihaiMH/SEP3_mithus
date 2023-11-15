using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IPostService
{
    Task<Post> CreatePostAsync(PostCreationDTO dto);
    Task<Post> GetByIdAsync(int id);
    Task<IEnumerable<Post>> GetAllPostsAsync();
    // Task<IEnumerable<Post>> GetAsync(SearchPostParametersDto dto);
}