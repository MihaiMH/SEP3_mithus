using System.Security.Claims;
using Microsoft.Extensions.DependencyInjection;

namespace Domain.Auth;

public static class AuthorizationPolicies
{
    public static void AddPolicies(IServiceCollection services)
    {
        services.AddAuthorizationCore(options =>
        {
            options.AddPolicy("MustBeClient", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Client"));
    
            options.AddPolicy("MustBeLandlord", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Landlord"));
            
            options.AddPolicy("MustBeMod", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Moderator"));
            
            options.AddPolicy("MustBeAdmin", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Administrator"));
            
            options.AddPolicy("MustBeInactive", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Inactive"));
            options.AddPolicy("MustBePending", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Pending"));
            
        });
    }
}