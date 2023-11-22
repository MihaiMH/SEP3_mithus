using Domain.DTOs;
using Domain.Models;

namespace HttpClients.ClientInterfaces;

public interface IPostService
{
    Task<IEnumerable<Post>> GetAllPostsAsync();
    Task<Post> CreateCommentAsync(PostCreationDTO dto);
    Task DeletePostAsync(long id);
    Task SetPostStatusAsync(long postId, long statusId);
    Task UpdatePostAsync(PostCreationDTO dto);
    Task<Post> GetPostByPostIdAsync(long id);
    Task<IEnumerable<PostStatus>> GetPostStatusesAsync();
    Task<IEnumerable<EnergyRating>> GetEnergyRatingsAsync();
    Task<IEnumerable<HousingType>> GetHousingTypesAsync();
}