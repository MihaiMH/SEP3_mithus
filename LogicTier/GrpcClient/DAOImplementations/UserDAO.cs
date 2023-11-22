using Application.DAOInterfaces;
using Dk.Via.Mithus.Protobuf;
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

    public Task<Domain.Models.User> LoginAsync(Domain.Models.User user)
    {
        UserLogin toBeLoggedIn = new UserLogin
        {
            Email = user.Email
        };

        User foundUser = userService.LoginUser(toBeLoggedIn);

        if (foundUser != null)
        {
            user.ID = foundUser.Id;
            user.Password = foundUser.Password;
            user.FirstName = foundUser.FirstName;
            user.LastName = foundUser.LastName;
            user.Role = new Domain.Models.Role()
            {
                ID = user.Role.ID,
                Name = user.Role.Name
            };
        }
        else
        {
            user.Email = "404NOTFOUND";
        }

        return Task.FromResult(user);
    }

    public Task<Domain.Models.User> RegisterAsync(Domain.Models.User user)
    {
        UserCreation toBeCreatedUser = new UserCreation
        {
            Email = user.Email,
            Password = user.Password,
            FirstName = user.FirstName,
            LastName = user.LastName,
            RoleId = user.Role.ID
        };

        User receivedUser = userService.RegisterUser(toBeCreatedUser);

        user.ID = receivedUser.Id;
        user.Password = "NO PASSWORD";

        return Task.FromResult(user);
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
            ID = roles.Inactive.Id,
            Name = roles.Inactive.Name
        });


        return rolesToBeSent;
    }
}