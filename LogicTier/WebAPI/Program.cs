using Application.DAOInterfaces;
using Application.LogicImplementations;
using Application.LogicInterfaces;
using Dk.Via.Mithus.Protobuf;
using GrpcClient;
using GrpcClient.DAOImplementations;
using Microsoft.Extensions.DependencyInjection;
using Grpc.Net.Client;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddGrpcClient<UserService.UserServiceClient>(o =>
{
    o.Address = new Uri("http://localhost:6565");
});


builder.Services.AddGrpcClient<PostService.PostServiceClient>(o =>
{
    o.Address = new Uri("http://localhost:6565");
});
builder.Services.AddScoped<IPostDao, PostDao>();
builder.Services.AddScoped<IPostLogic, PostLogic>();


var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();