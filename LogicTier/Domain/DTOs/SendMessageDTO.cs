namespace Domain.DTOs;

public class SendMessageDTO
{
    public long ID { get; set; }
    public long ChatID { get; set; }
    public long UserID { get; set; }
    public string Text { get; set; }
    public string Time { get; set; }
}