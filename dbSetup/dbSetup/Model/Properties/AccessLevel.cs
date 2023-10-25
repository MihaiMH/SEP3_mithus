using System.ComponentModel.DataAnnotations;

namespace dbSetup.Model.Properties;

public class AccessLevel
{
    [Key] public Guid ID { get; set; }

    [Required] public string name { get; set; }
}