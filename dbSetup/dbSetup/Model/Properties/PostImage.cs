using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace dbSetup.Model.Properties;

public class PostImage
{
    [Key] public Guid ID { get; set; }

    [ForeignKey("ID")] [Required] public Image imageID { get; set; }
    
    [ForeignKey("ID")] [Required] public Post postID { get; set; }
}