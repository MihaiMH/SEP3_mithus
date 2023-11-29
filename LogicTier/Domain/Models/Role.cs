namespace Domain.Models;

public class Role
{
    public long ID { get; set; }
    public string Name { get; set; }

    public override string ToString()
    {
        return Name;
    }
}