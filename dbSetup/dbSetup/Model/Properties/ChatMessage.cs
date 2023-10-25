using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace dbSetup.Model.Properties;

public class ChatMessage
{
    [Key] public Guid ID { get; set; }

    [ForeignKey("ID")] public Chat chatID { get; set; }

    [ForeignKey("ID")] public Message messageID { get; set; }
}