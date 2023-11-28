namespace Domain.Models;

public class EnergyRating
{
    public long ID { get; set; }
    public string Name { get; set; }
    public override string ToString()
    {
        return Name;
    }
}