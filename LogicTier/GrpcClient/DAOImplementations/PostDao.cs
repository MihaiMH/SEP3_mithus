using System.Reflection;
using System.Runtime.InteropServices.JavaScript;
using Application.DAOInterfaces;
using Dk.Via.Mithus.Protobuf;
using Domain.Models;
using Google.Protobuf.Collections;
using Grpc.Core;
using Address = Dk.Via.Mithus.Protobuf.Address;
using Amenity = Dk.Via.Mithus.Protobuf.Amenity;
using Cost = Dk.Via.Mithus.Protobuf.Cost;
using EnergyRating = Dk.Via.Mithus.Protobuf.EnergyRating;
using HousingType = Dk.Via.Mithus.Protobuf.HousingType;
using Image = Dk.Via.Mithus.Protobuf.Image;
using PostStatus = Dk.Via.Mithus.Protobuf.PostStatus;
using Void = Dk.Via.Mithus.Protobuf.Void;


namespace GrpcClient.DAOImplementations;

public class PostDao : IPostDao
{
    private PostService.PostServiceClient postService;

    public PostDao(PostService.PostServiceClient postService)
    {
        this.postService = postService;
    }

    public Task<Post> GetPostByPostIdAsync(long id)
    {
        PostCreation post = postService.GetPost(new PostId
        {
            Id = id
        });

        Post foundPost = new Post();
            
        if (post != null)
        {
            foundPost = new Post
            {
                Title = post.Title,
                Description = post.Description,
                Address = new Domain.Models.Address
                {
                    City = post.Address.City,
                    Country = post.Address.Country,
                    Street = post.Address.Street,
                    Zipcode = post.Address.ZipCode
                },
                Area = post.Area,

                MaxTenants = post.MaxTenants,
                HousingType = new Domain.Models.HousingType
                {
                    Name = post.HousingType.Name
                },
                EnergyRating = new Domain.Models.EnergyRating
                {
                    Name = post.EnergyRating.Name
                },

                Cost = new Domain.Models.Cost
                {
                    Deposit = post.Cost.Deposit,
                    MonthlyRent = post.Cost.MonthlyRent,
                    MoveInPrice = post.Cost.MoveInPrice,
                    Utilities = post.Cost.Utilities
                },
                CreationDate = post.CreationDate,
                PostStatus = new Domain.Models.PostStatus
                {
                    ID = post.Status.Id,
                    Status = post.Status.Status
                }
            };
        }
        else
        {
            foundPost.Title = "404NOTFOUND";
        }

        return Task.FromResult(foundPost);
    }

    public Task UpdatePostAsync(Post post)
    {
        PostStatuses postStatuses = postService.GetPostStatuses(new Void());

        var registerPost = new PostCreation()
        {
            Id = post.ID,
            Title = post.Title,
            Description = post.Description,
            Address = new Address
            {
                City = post.Address.City,
                Country = post.Address.Country,
                Street = post.Address.Street,
                ZipCode = post.Address.Zipcode
            },
            Area = post.Area,

            MaxTenants = post.MaxTenants,
            HousingType = new HousingType
            {
                Name = post.HousingType.Name
            },
            EnergyRating = new EnergyRating
            {
                Name = post.EnergyRating.Name
            },

            Cost = new Cost
            {
                Deposit = post.Cost.Deposit,
                MonthlyRent = post.Cost.MonthlyRent,
                MoveInPrice = post.Cost.MoveInPrice,
                Utilities = post.Cost.Utilities
            },
            CreationDate = post.CreationDate,
            Status = postStatuses.Pending
        };

        PostCreation updatedPost = postService.UpdatePost(registerPost);

        return Task.FromResult(updatedPost);
    }

    public Task SetPostStatusAsync(long id, int statusID)
    {
        PostStatuses postStatuses = postService.GetPostStatuses(new Void());

        PostCreation toBeUpdated = postService.GetPost(new PostId
        {
            Id = id
        });


        switch (statusID)
        {
            case 1:
                toBeUpdated.Status = postStatuses.Available;
                break;
            case 2:
                toBeUpdated.Status = postStatuses.Reserved;
                break;
            case 3:
                toBeUpdated.Status = postStatuses.Hidden;
                break;
            case 4:
                toBeUpdated.Status = postStatuses.Denied;
                break;
            case 5:
                toBeUpdated.Status = postStatuses.Pending;
                break;
        }

        PostCreation updatedPost = postService.UpdatePost(toBeUpdated);


        return Task.FromResult(updatedPost);
    }

    public Task DeletePostAsync(long id)
    {
        PostDelete postDelete = new PostDelete
        {
            Id = id
        };

        return Task.FromResult(postService.DeletePost(postDelete));
    }

    public async Task<Domain.Models.Post> CreatePostAsync(Domain.Models.Post post)
    {
        PostStatuses postStatuses = postService.GetPostStatuses(new Void());
        var registerPost = new PostCreation()
        {
            Title = post.Title,
            Description = post.Description,
            Address = new Address
            {
                City = post.Address.City,
                Country = post.Address.Country,
                Street = post.Address.Street,
                ZipCode = post.Address.Zipcode
            },
            Area = post.Area,

            MaxTenants = post.MaxTenants,
            HousingType = new HousingType
            {
                Name = post.HousingType.Name
            },
            EnergyRating = new EnergyRating
            {
                Name = post.EnergyRating.Name
            },

            Cost = new Cost
            {
                Deposit = post.Cost.Deposit,
                MonthlyRent = post.Cost.MonthlyRent,
                MoveInPrice = post.Cost.MoveInPrice,
                Utilities = post.Cost.Utilities
            },
            CreationDate = post.CreationDate,
            Status = postStatuses.Pending
        };

        foreach (Domain.Models.Amenity amenity in post.Amenities)
        {
            registerPost.Amenity.Add(new Amenity
            {
                Name = amenity.Name,
                Description = amenity.Description
            });
        }

        foreach (Domain.Models.Image image in post.Images)
        {
            registerPost.Image.Add(new Image
            {
                Address = image.Link
            });
        }

        PostCreation createdPostProto;
        try
        {
            createdPostProto = await postService.CreatePostAsync(registerPost);
        }
        catch (Exception e)
        {
            throw new Exception("Error occured while creating the post. Please try again later.");
        }

        post.ID = createdPostProto.Id;

        return post;
    }

    public async Task<IEnumerable<Domain.Models.Post>> GetAllPostsAsync()
    {
        Posts receivedPosts = postService.GetPosts(new Void());
        RepeatedField<PostCreation> posts = receivedPosts.Posts_;

        List<Domain.Models.Post> toBeSentPosts = new List<Domain.Models.Post>();

        foreach (PostCreation post in posts)
        {
            toBeSentPosts.Add(new Domain.Models.Post
            {
                Title = post.Title,
                Description = post.Description,
                Address = new Domain.Models.Address
                {
                    City = post.Address.City,
                    Country = post.Address.Country,
                    Street = post.Address.Street,
                    Zipcode = post.Address.ZipCode
                },
                Area = post.Area,

                MaxTenants = post.MaxTenants,
                HousingType = new Domain.Models.HousingType
                {
                    Name = post.HousingType.Name
                },
                EnergyRating = new Domain.Models.EnergyRating
                {
                    Name = post.EnergyRating.Name
                },

                Cost = new Domain.Models.Cost
                {
                    Deposit = post.Cost.Deposit,
                    MonthlyRent = post.Cost.MonthlyRent,
                    MoveInPrice = post.Cost.MoveInPrice,
                    Utilities = post.Cost.Utilities
                },
                CreationDate = post.CreationDate,
                PostStatus = new Domain.Models.PostStatus
                {
                    ID = post.Status.Id,
                    Status = post.Status.Status
                }
            });
        }

        return toBeSentPosts;
    }
}