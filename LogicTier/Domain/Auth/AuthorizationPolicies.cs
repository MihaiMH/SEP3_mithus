using System.Security.Claims;
using Microsoft.Extensions.DependencyInjection;

namespace Domain.Auth;

public static class AuthorizationPolicies
{
    public static void AddPolicies(IServiceCollection services)
    {
        services.AddAuthorizationCore(options =>
        {
            options.AddPolicy("MustBeC", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Client"));
    
            options.AddPolicy("MustBeC", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Landlord"));
            
            options.AddPolicy("MustBeC", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Moderator"));
            
            options.AddPolicy("MustBeC", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Administrator"));
            
            options.AddPolicy("MustBeC", a =>
                a.RequireAuthenticatedUser().RequireClaim("Role", "Inactive"));
            
        });
    }
}