using Domain.Models;

namespace Domain.DTOs;

public class CreateChatDTO
{
    public long PostID { get; set; }
    public long UserID { get; set; }
    public Message Message { get; set; }
}