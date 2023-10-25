using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace dbSetup.Model.Properties;

public class User
{
    [Key] public Guid ID { get; set; }

    [Required] public string userName { get; set; }
    
    [Required] public string firstName { get; set; }

    [Required] public string lastName { get; set; }

    [ForeignKey("ID")] [Required] public AccessLevel accessLevelID { get; set; }

    [Required] public string password { get; set; }
}