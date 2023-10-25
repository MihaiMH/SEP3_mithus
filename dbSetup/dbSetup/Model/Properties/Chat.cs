using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace dbSetup.Model.Properties;

public class Chat
{
    [Key] public Guid ID { get; set; }

    public Guid clientID { get; set; }
    public User client { get; set; }

    public Guid landlordID { get; set; }
    public User landlord { get; set; }


    [Required] public Post postID { get; set; }
}