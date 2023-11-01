using Application.DAOInterfaces;
using Dk.Via.Mithus.Protobuf;


namespace GrpcClient.DAOImplementations;

public class PostDao : IPostDao
{
    private PostService.PostServiceClient postService;

    public PostDao(PostService.PostServiceClient postService)
    {
        this.postService = postService;
    }

    public async Task<Domain.Models.Post> CreatePostAsync(Domain.Models.Post post)
    {
       var registerPost = new Post
        {
            Title = post.Title,
            Description = post.Description,
            Street = post.Street,
            Area = post.Area,
            IsFurnished = post.IsFurnished,
            HasBalcony = post.HasBalcony,
            SmokingAllowed = post.SmokingAllowed,
            MaxTenants = post.MaxTenants,
            Type = post.Type,
            EnergyRating = post.EnergyRating,
            HasDishwasher = post.HasDishwasher,
            HasWashingMachine = post.HasWashingMachine,
            HasDryer = post.HasDryer,
            MonthlyRent = post.MonthlyRent,
            Deposit = post.Deposit,
            MoveInPrice = post.MoveInPrice,
            Utilities = post.Utilities,
            Status = "zzz"
        };
       
        await postService.CreatePostAsync(registerPost);

        return post;
    }
}