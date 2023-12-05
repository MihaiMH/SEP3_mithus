using Application.DAOInterfaces;
using Dk.Via.Mithus.Protobuf;
using Google.Protobuf.Collections;
using Role = Domain.Models.Role;
using Void = Dk.Via.Mithus.Protobuf.Void;

namespace GrpcClient.DAOImplementations;

public class UserDAO : IUserDAO
{
    private UserService.UserServiceClient userService;

    public UserDAO(UserService.UserServiceClient userService)
    {
        this.userService = userService;
    }

    public async Task<Domain.Models.User> LoginAsync(Domain.Models.User user)
    {
        UserLogin toBeLoggedIn = new UserLogin
        {
            Email = user.Email
        };

        User foundUser = await userService.LoginUserAsync(toBeLoggedIn);

        if (foundUser != null)
        {
            user.ID = foundUser.Id;
            user.Password = foundUser.Password;
            user.FirstName = foundUser.FirstName;
            user.LastName = foundUser.LastName;
            user.Role = new Role()
            {
                ID = foundUser.Role.Id,
                Name = foundUser.Role.Name
            };
        }
        else
        {
            user.Email = "404NOTFOUND";
        }

        return user;
    }

    public async Task<Domain.Models.User> RegisterAsync(Domain.Models.User user)
    {
        Roles roles = await userService.GetRolesAsync(new Void());

        UserCreation toBeCreatedUser = new UserCreation
        {
            Email = user.Email,
            Password = user.Password,
            FirstName = user.FirstName,
            LastName = user.LastName,
            RoleId = roles.Client.Id
        };

        User receivedUser = userService.RegisterUser(toBeCreatedUser);

        user.ID = receivedUser.Id;
        user.Password = "NO PASSWORD";

        return user;
    }

    public async Task SetUserStatusAsync(int userId, int roleId)
    {
        await userService.SetUserStatusAsync(new RoleUpdate
        {
            RoleId = roleId,
            UserId = userId
        });
    }

    public async Task<IEnumerable<Role>> GetRolesAsync()
    {
        Roles roles = await userService.GetRolesAsync(new Void());
        List<Role> rolesToBeSent = new List<Role>();

        rolesToBeSent.Add(new Role
        {
            ID = roles.Client.Id,
            Name = roles.Client.Name
        });

        rolesToBeSent.Add(new Role
        {
            ID = roles.Landlord.Id,
            Name = roles.Landlord.Name
        });

        rolesToBeSent.Add(new Role
        {
            ID = roles.Moderator.Id,
            Name = roles.Moderator.Name
        });

        rolesToBeSent.Add(new Role
        {
            ID = roles.Administrator.Id,
            Name = roles.Administrator.Name
        });

        rolesToBeSent.Add(new Role
        {
            ID = roles.Inactive.Id,
            Name = roles.Inactive.Name
        });

        rolesToBeSent.Add(new Role
        {
            ID = roles.Pending.Id,
            Name = roles.Pending.Name
        });

        return rolesToBeSent;
    }

    public async Task<Domain.Models.User> GetUserByIdAsync(int userId)
    {
        User foundUser = await userService.GetUserByIdAsync(new UserId
        {
            UserId_ = userId
        });

        Domain.Models.User user = new Domain.Models.User
        {
            ID = foundUser.Id,
            Email = foundUser.Email,
            FirstName = foundUser.FirstName,
            LastName = foundUser.LastName,
            Role = new Role
            {
                ID = foundUser.Role.Id,
                Name = foundUser.Role.Name
            }
        };

        return user;
    }

    public async Task<IEnumerable<Domain.Models.User>> GetUsersAsync()
    {
        Users foundUsersProto = await userService.GetUsersAsync(new Void());
        RepeatedField<User> foundUsers = foundUsersProto.Users_;

        List<Domain.Models.User> users = new List<Domain.Models.User>();

        foreach (var foundUser in foundUsers)
        {
            users.Add(new Domain.Models.User
            {
                ID = foundUser.Id,
                Email = foundUser.Email,
                FirstName = foundUser.FirstName,
                LastName = foundUser.LastName,
                Role = new Role
                {
                    ID = foundUser.Role.Id,
                    Name = foundUser.Role.Name
                }
            });
        }

        return users;
    }

    public async Task<Domain.Models.User> UpdateUserAsync(Domain.Models.User user)
    {
        UserUpdate update = new UserUpdate
        {
            Id = user.ID,
            Password = user.Password,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Email = user.Email
        };

        User updatedUser = await userService.UpdateUserAsync(update);

        Domain.Models.User userToReturn = new Domain.Models.User()
        {
            ID = updatedUser.Id,
            Password = user.Password,
            FirstName = user.FirstName,
            LastName = user.LastName,
            Role = new Role
            {
                ID = updatedUser.Role.Id,
                Name = updatedUser.Role.Name
            }
        };

        return userToReturn;
    }
}