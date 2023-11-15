using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IPostLogic
{
    public Task<IEnumerable<HousingType>> GetHousingTypesAsync();
    public Task<IEnumerable<EnergyRating>> GetEnergyRatingsAsync();
    public Task<IEnumerable<PostStatus>> GetPostStatusesAsync();
    public Task<Post> GetPostByPostIdAsync(long id);
    public Task UpdatePostAsync(PostCreationDTO dto);
    public Task SetPostStatusAsync(long id, long statusID);
    public Task DeletePostAsync(long id);
    
    public Task<Post> CreatePostAsync(PostCreationDTO dto);
    public Task<IEnumerable<Post>> GetAllPostsAsync();
}