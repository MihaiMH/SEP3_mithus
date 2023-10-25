using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace dbSetup.Model.Properties;

public class Message
{
    [Key] public Guid ID { get; set; }

    [ForeignKey("ID")] public User senderID { get; set; }

    [Required] public string context { get; set; }

    [Column(TypeName = "datetime")]
    [Required]
    public DateTime time { get; set; }
}