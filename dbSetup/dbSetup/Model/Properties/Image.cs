using System.ComponentModel.DataAnnotations;

namespace dbSetup.Model.Properties;

public class Image
{
    [Key] public Guid ID { get; set; }

    [Required] public string address { get; set; }
}