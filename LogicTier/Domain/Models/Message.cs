namespace Domain.Models;

public class Message
{
    public long ID { get; set; }
    public long UserID { get; set; }
    public string Text { get; set; }
    public string Time { get; set; }
}