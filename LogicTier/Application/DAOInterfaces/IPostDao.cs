using Domain.Models;

namespace Application.DAOInterfaces;

public interface IPostDao
{
    public Task<IEnumerable<HousingType>> GetHousingTypesAsync();
    public Task<IEnumerable<EnergyRating>> GetEnergyRatingsAsync();
    public Task<IEnumerable<PostStatus>> GetPostStatusesAsync();
    public Task<Post> GetPostByPostIdAsync(long id);
    public Task UpdatePostAsync(Post post);
    public Task SetPostStatusAsync(long id, long statusID);
    public Task DeletePostAsync(long id);
    public Task<Post> CreatePostAsync(Post post);
    public Task<IEnumerable<Post>> GetAllPostsAsync();
}