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

    public async Task<IEnumerable<Domain.Models.HousingType>> GetHousingTypesAsync()
    {
        HousingTypes receivedProto = postService.GetHousingTypes(new Void());
        RepeatedField<HousingType> receivedTypes = receivedProto.HousingTypes_;

        List<Domain.Models.HousingType> typesToBeSent = new List<Domain.Models.HousingType>();

        foreach (var type in receivedTypes)
        {
            typesToBeSent.Add(new Domain.Models.HousingType
            {
                ID = type.Id,
                Name = type.Name
            });
        }

        return typesToBeSent;
    }

    public async Task<IEnumerable<Domain.Models.EnergyRating>> GetEnergyRatingsAsync()
    {
        EnergyRatings receivedProto = postService.GetEnergyRatings(new Void());
        RepeatedField<EnergyRating> receivedRatings = receivedProto.EnergyRatings_;

        List<Domain.Models.EnergyRating> ratingsToBeSent = new List<Domain.Models.EnergyRating>();

        foreach (var rating in receivedRatings)
        {
            ratingsToBeSent.Add(new Domain.Models.EnergyRating
            {
                ID = rating.Id,
                Name = rating.Name
            });
        }

        return ratingsToBeSent;
    }

    public async Task<IEnumerable<Domain.Models.PostStatus>> GetPostStatusesAsync()
    {
        PostStatuses receivedStatuses = postService.GetPostStatuses(new Void());

        List<Domain.Models.PostStatus> statusesToBeSent = new List<Domain.Models.PostStatus>();


        statusesToBeSent.Add(new Domain.Models.PostStatus
        {
            ID = receivedStatuses.Available.Id,
            Status = receivedStatuses.Available.Status
        });
        statusesToBeSent.Add(new Domain.Models.PostStatus
        {
            ID = receivedStatuses.Pending.Id,
            Status = receivedStatuses.Pending.Status
        });
        statusesToBeSent.Add(new Domain.Models.PostStatus
        {
            ID = receivedStatuses.Denied.Id,
            Status = receivedStatuses.Denied.Status
        });
        statusesToBeSent.Add(new Domain.Models.PostStatus
        {
            ID = receivedStatuses.Hidden.Id,
            Status = receivedStatuses.Hidden.Status
        });
        statusesToBeSent.Add(new Domain.Models.PostStatus
        {
            ID = receivedStatuses.Reserved.Id,
            Status = receivedStatuses.Reserved.Status
        });

        return statusesToBeSent;
    }

    public Task<Post> GetPostByPostIdAsync(long id)
    {
        PostResponse post = postService.GetPost(new PostId
        {
            Id = id
        });

        Post foundPost = new Post();

        List<Domain.Models.Amenity> amenities = new List<Domain.Models.Amenity>();
        foreach (Amenity amenity in post.Amenity)
        {
            amenities.Add(new Domain.Models.Amenity
            {
                ID = amenity.Id,
                Name = amenity.Name,
                Description = amenity.Description
            });
        }

        List<Domain.Models.Image> images = new List<Domain.Models.Image>();
        foreach (Image image in post.Image)
        {
            images.Add(new Domain.Models.Image()
            {
                ID = image.Id,
                Link = image.Address
            });
        }

        if (post != null)
        {
            foundPost = new Post
            {
                ID = post.Id,
                Title = post.Title,
                UserID = new Domain.Models.User()
                {
                    ID = post.Landlord.Id,
                    Email = post.Landlord.Email,
                    FirstName = post.Landlord.FirstName,
                    LastName = post.Landlord.LastName,
                    Role = new Domain.Models.Role
                    {
                        ID = post.Landlord.Role.Id,
                        Name = post.Landlord.Role.Name
                    }
                },
                Description = post.Description,
                Address = new Domain.Models.Address
                {
                    ID = post.Address.Id,
                    City = post.Address.City,
                    Country = post.Address.Country,
                    Street = post.Address.Street,
                    Zipcode = post.Address.ZipCode
                },
                Area = post.Area,

                MaxTenants = post.MaxTenants,
                HousingType = new Domain.Models.HousingType
                {
                    ID = post.HousingType.Id,
                    Name = post.HousingType.Name
                },
                EnergyRating = new Domain.Models.EnergyRating
                {
                    ID = post.EnergyRating.Id,
                    Name = post.EnergyRating.Name
                },

                Cost = new Domain.Models.Cost
                {
                    ID = post.Cost.Id,
                    Deposit = post.Cost.Deposit,
                    MonthlyRent = post.Cost.MonthlyRent,
                    MoveInPrice = post.Cost.MoveInPrice,
                    Utilities = post.Cost.Utilities
                },
                CreationDate = post.CreationDate,
                Amenities = amenities,
                Images = images,
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
            LandlordId = post.UserID.ID,
            Address = new Address
            {
                Id = post.ID,
                City = post.Address.City,
                Country = post.Address.Country,
                Street = post.Address.Street,
                ZipCode = post.Address.Zipcode
            },
            Area = post.Area,

            MaxTenants = post.MaxTenants,
            HousingTypeId = post.HousingType.ID,
            EnergyRatingId = post.EnergyRating.ID,
            Cost = new Cost
            {
                Id = post.ID,
                Deposit = post.Cost.Deposit,
                MonthlyRent = post.Cost.MonthlyRent,
                MoveInPrice = post.Cost.MoveInPrice,
                Utilities = post.Cost.Utilities
            },
            CreationDate = post.CreationDate,
            StatusId = postStatuses.Pending.Id
        };

        foreach (Domain.Models.Amenity amenity in post.Amenities)
        {
            registerPost.Amenity.Add(new Amenity
            {
                Id = amenity.ID,
                Description = amenity.Description,
                Name = amenity.Name
            });
        }


        foreach (Domain.Models.Image image in post.Images)
        {
            registerPost.Image.Add(new Image
            {
                Address = image.Link
            });
        }

        PostResponse updatedPost = postService.UpdatePost(registerPost);

        return Task.FromResult(updatedPost);
    }

    public async Task SetPostStatusAsync(long id, long statusID)
    {
        await postService.SetPostStatusAsync(new PostStatusUpdate
        {
            PostId = id,
            StatusId = statusID
        });
    }

    public Task DeletePostAsync(long id)
    {
        return Task.FromResult(postService.DeletePost(new PostId
        {
            Id = id
        }));
    }

    public async Task<Domain.Models.Post> CreatePostAsync(Domain.Models.Post post)
    {
        PostStatuses postStatuses = postService.GetPostStatuses(new Void());
        var registerPost = new PostCreation()
        {
            Title = post.Title,

            LandlordId = post.UserID.ID,

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
            HousingTypeId = post.HousingType.ID,
            EnergyRatingId = post.EnergyRating.ID,

            Cost = new Cost
            {
                Deposit = post.Cost.Deposit,
                MonthlyRent = post.Cost.MonthlyRent,
                MoveInPrice = post.Cost.MoveInPrice,
                Utilities = post.Cost.Utilities
            },
            CreationDate = post.CreationDate,
            StatusId = postStatuses.Pending.Id
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

        PostResponse createdPostProto;
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
        Posts receivedPosts = await postService.GetPostsAsync(new Void());
        RepeatedField<PostResponse> posts = receivedPosts.Posts_;

        List<Domain.Models.Post> toBeSentPosts = new List<Domain.Models.Post>();

        foreach (PostResponse post in posts)
        {
            List<Domain.Models.Amenity> amenities = new List<Domain.Models.Amenity>();
            foreach (Amenity amenity in post.Amenity)
            {
                amenities.Add(new Domain.Models.Amenity
                {
                    ID = amenity.Id,
                    Name = amenity.Name,
                    Description = amenity.Description
                });
            }

            List<Domain.Models.Image> images = new List<Domain.Models.Image>();
            foreach (Image image in post.Image)
            {
                images.Add(new Domain.Models.Image()
                {
                    ID = image.Id,
                    Link = image.Address
                });
            }

            toBeSentPosts.Add(new Domain.Models.Post
            {
                ID = post.Id,
                UserID = new Domain.Models.User
                {
                    ID = post.Landlord.Id,
                    Email = post.Landlord.Email,
                    FirstName = post.Landlord.FirstName,
                    LastName = post.Landlord.LastName,
                    Role = new Domain.Models.Role
                    {
                        ID = post.Landlord.Role.Id,
                        Name = post.Landlord.Role.Name
                    }
                },
                Title = post.Title,
                Description = post.Description,
                Address = new Domain.Models.Address
                {
                    ID = post.Address.Id,
                    City = post.Address.City,
                    Country = post.Address.Country,
                    Street = post.Address.Street,
                    Zipcode = post.Address.ZipCode
                },
                Area = post.Area,

                MaxTenants = post.MaxTenants,
                HousingType = new Domain.Models.HousingType
                {
                    ID = post.HousingType.Id,
                    Name = post.HousingType.Name
                },
                EnergyRating = new Domain.Models.EnergyRating
                {
                    ID = post.EnergyRating.Id,
                    Name = post.EnergyRating.Name
                },

                Cost = new Domain.Models.Cost
                {
                    ID = post.Cost.Id,
                    Deposit = post.Cost.Deposit,
                    MonthlyRent = post.Cost.MonthlyRent,
                    MoveInPrice = post.Cost.MoveInPrice,
                    Utilities = post.Cost.Utilities
                },
                CreationDate = post.CreationDate,
                Amenities = amenities,
                PostStatus = new Domain.Models.PostStatus
                {
                    ID = post.Status.Id,
                    Status = post.Status.Status
                },
                Images = images
            });
        }

        return toBeSentPosts;
    }
}