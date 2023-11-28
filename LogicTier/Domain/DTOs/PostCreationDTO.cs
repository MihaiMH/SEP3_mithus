using System.Text;
using Domain.Models;

namespace Domain.DTOs;

public class PostCreationDTO
{
    public long ID { get; set; }
    public User UserID { get; set; }
    public string Title { get; set; }
    public string Description { get; set; }

    public Address Address { get; set; }
    public double Area { get; set; }

    public IEnumerable<Amenity> Amenities { get; set; }
    public int MaxTenants { get; set; }

    public HousingType HousingType { get; set; }

    public EnergyRating EnergyRating { get; set; }

    public Cost Cost { get; set; }
    public string CreationDate { get; set; }
    
    public IEnumerable<ImageByte> Images { get; set; }
    
    public PostStatus PostStatus { get; set; }
    
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