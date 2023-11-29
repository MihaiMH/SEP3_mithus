using System.Globalization;
using Application.DAOInterfaces;
using Application.ImageUpload;
using Application.LogicInterfaces;
using Domain.DTOs;
using Domain.Models;

namespace Application.LogicImplementations;

public class PostLogic : IPostLogic
{
    private readonly IPostDao postDao;

    public PostLogic(IPostDao postDao)
    {
        this.postDao = postDao;
    }

    public async Task<IEnumerable<HousingType>> GetHousingTypesAsync()
    {
        return await postDao.GetHousingTypesAsync();
    }

    public async Task<IEnumerable<EnergyRating>> GetEnergyRatingsAsync()
    {
        return await postDao.GetEnergyRatingsAsync();
    }

    public async Task<IEnumerable<PostStatus>> GetPostStatusesAsync()
    {
        return await postDao.GetPostStatusesAsync();
    }

    public async Task<Post> GetPostByPostIdAsync(long id)
    {
        Post foundPost = await postDao.GetPostByPostIdAsync(id);

        if (foundPost.Title.Equals("404NOTFOUND"))
        {
            throw new Exception("Post not found");
        }

        return foundPost;
    }

    public async Task UpdatePostAsync(PostCreationDTO dto)
    {
        ValidateData(dto);

        List<Image> images = new List<Image>();

        foreach (ImageByte imgData in dto.Images)
        {
            images.Add(new Image()
            {
                Link = await ImgUploadingService.UploadImage(imgData.imageData)
            });
        }

        Post post = new Post
        {
            ID = dto.ID,
            UserID = dto.UserID,
            Title = dto.Title,
            Description = dto.Description,
            Address = dto.Address,
            Area = dto.Area,
            MaxTenants = dto.MaxTenants,
            Amenities = dto.Amenities,
            HousingType = dto.HousingType,
            EnergyRating = dto.EnergyRating,

            Cost = dto.Cost,
            Images = images,
            CreationDate = dto.CreationDate,
            PostStatus = dto.PostStatus
        };
        await postDao.UpdatePostAsync(post);
    }

    public async Task SetPostStatusAsync(long id, long statusId)
    {
        await postDao.SetPostStatusAsync(id, statusId);
    }

    public async Task DeletePostAsync(long id)
    {
        await Task.FromResult(postDao.DeletePostAsync(id));
    }

    public async Task<Post> CreatePostAsync(PostCreationDTO dto)
    {
        ValidateData(dto);

        List<Image> images = new List<Image>();

        foreach (ImageByte imgData in dto.Images)
        {
            images.Add(new Image()
            {
                Link = await ImgUploadingService.UploadImage(imgData.imageData)
            });
        }

        Post post = new Post
        {
            UserID = dto.UserID,
            Title = dto.Title,
            Description = dto.Description,
            Address = dto.Address,
            Area = dto.Area,
            MaxTenants = dto.MaxTenants,
            Amenities = dto.Amenities,
            HousingType = dto.HousingType,
            EnergyRating = dto.EnergyRating,
            Images = images,
            Cost = dto.Cost,

            CreationDate = DateTime.Now.ToString(new CultureInfo("en-us")),
            PostStatus = dto.PostStatus
        };

        Console.WriteLine(post.ToString());

        return await postDao.CreatePostAsync(post);
    }

    public async Task<IEnumerable<Post>> GetAllPostsAsync()
    {
        return await postDao.GetAllPostsAsync();
    }

    // TODO: De terminat Validate Data
    private static void ValidateData(PostCreationDTO dto)
    {
        string title = dto.Title;
        string description = dto.Description;
        string street = dto.Address.Street;

        if (string.IsNullOrWhiteSpace(title) || string.IsNullOrWhiteSpace(title))
        {
            throw new Exception("The title of the post can't be empty");
        }

        if (title.Length < 5 || title.Length > 30)
        {
            throw new Exception("The title of the post can't have less than 5 or more than 30 characters");
        }

        if (string.IsNullOrWhiteSpace(description) || string.IsNullOrWhiteSpace(description))
        {
            throw new Exception("The description of the post can't be empty");
        }

        if (description.Length < 5 || description.Length > 1000)
        {
            throw new Exception("The description of the post can't have less than 5 or more than 1000 characters");
        }

        if (string.IsNullOrWhiteSpace(street) || string.IsNullOrWhiteSpace(street))
        {
            throw new Exception("The street of the post can't be empty");
        }

        if (street.Length < 5 || street.Length > 25)
        {
            throw new Exception("The street of the post can't have less than 5 or more than 25 characters");
        }
    }
}