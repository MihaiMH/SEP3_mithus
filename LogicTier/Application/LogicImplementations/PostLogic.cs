using System.Globalization;
using Application.DAOInterfaces;
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

    public async Task<Post> CreatePostAsync(PostCreationDTO dto)
    {
        ValidateDate(dto);
        
        Console.WriteLine(dto.ToString());
        
        Post post = new Post
        {
            UserID = dto.UserID,
            Title = dto.Title,
            Description = dto.Description,
            Street = dto.Street,
            Area = dto.Area,
            IsFurnished = dto.IsFurnished,
            HasBalcony = dto.HasBalcony,
            SmokingAllowed = dto.SmokingAllowed,
            MaxTenants = dto.MaxTenants,
            Type = dto.Type,
            EnergyRating = dto.EnergyRating,
            HasDishwasher = dto.HasDishwasher,
            HasWashingMachine = dto.HasWashingMachine,
            HasDryer = dto.HasDryer,
            MonthlyRent = dto.MonthlyRent,
            Deposit = dto.Deposit,
            MoveInPrice = dto.MoveInPrice,
            Utilities = dto.Utilities,
            CreationDate = DateTime.Now.ToString(new CultureInfo("en-us")),
            Status = "Pending"
        };
        
        Console.WriteLine(post.ToString());

        return await postDao.CreatePostAsync(post);
    }

    private static void ValidateDate(PostCreationDTO dto)
    {
        string title = dto.Title;
        string description = dto.Description;
        string street = dto.Street;

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