using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace dbSetup.Model.Properties;

public class Post
{
    [Key] public Guid ID { get; set; }

    [ForeignKey("ID")] [Required] public User userID { get; set; }

    [Required] public string title { get; set; }

    [Required] public string description { get; set; }

    [Required] public double area { get; set; }

    [Required] public bool isFurnished { get; set; }

    [Required] public bool hasBalcony { get; set; }

    [Required] public bool smokingAllowed { get; set; }

    [Required] public int maxTenants { get; set; }

    [Required] public string type { get; set; }

    [Required] public string energyRating { get; set; }

    [Required] public bool hasParking { get; set; }

    [Required] public bool hasDishwasher { get; set; }

    [Required] public bool hasWashingMachine { get; set; }

    [Required] public bool hasDryer { get; set; }

    [Required] public double monthlyRent { get; set; }

    [Required] public double deposit { get; set; }

    [Required] public double moveInPrice { get; set; }

    [Required] public double utilities { get; set; }

    [Column(TypeName = "datetime")]
    [Required]
    public DateTime creationDate { get; set; }

    [Required] public string status { get; set; }
}