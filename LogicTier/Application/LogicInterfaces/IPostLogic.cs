using Domain.DTOs;
using Domain.Models;

namespace Application.LogicInterfaces;

public interface IPostLogic
{
    public Task<Post> CreatePostAsync(PostCreationDTO dto);
}