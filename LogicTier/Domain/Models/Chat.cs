namespace Domain.Models;

public class Chat
{
    public long ID { get; set; }
    public long PostID { get; set; }
    public string PostName { get; set; }
    public IEnumerable<Message> Messages { get; set; }
}