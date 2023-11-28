namespace Domain.Models;

public class PostStatus
{
    public long ID { get; set; }
    public string Status { get; set; }
    public override string ToString()
    {
        return Status;
    }
}