using System.Text;

namespace Domain.Models;

public class Post
{
    public string ID { get; set; }
    public string UserID { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }
    public string Street { get; set; }
    public double Area { get; set; }
    public bool IsFurnished { get; set; }
    public bool HasBalcony { get; set; }

    public bool SmokingAllowed { get; set; }
    public bool HasParking { get; set; }
    public int MaxTenants { get; set; }

    public string Type { get; set; }

    public string EnergyRating { get; set; }

    public bool HasDishwasher { get; set; }
    public bool HasWashingMachine { get; set; }
    public bool HasDryer { get; set; }
    public double MonthlyRent { get; set; }
    public double Deposit { get; set; }
    public double MoveInPrice { get; set; }
    public double Utilities { get; set; }
    public string CreationDate { get; set; }
    public string Status { get; set; }
    
    public override string ToString()
    {
        return GetType().GetProperties()
            .Select(info => (info.Name, Value: info.GetValue(this, null) ?? "(null)"))
            .Aggregate(
                new StringBuilder(),
                (sb, pair) => sb.AppendLine($"{pair.Name}: {pair.Value}"),
                sb => sb.ToString());
    }
}