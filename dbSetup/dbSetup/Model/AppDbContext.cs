using dbSetup.Model.Properties;
using Microsoft.EntityFrameworkCore;

namespace dbSetup.Model;

public class AppDbContext : DbContext
{
    public DbSet<AccessLevel> AccessLevel { get; set; }
    public DbSet<Chat> Chat { get; set; }
    public DbSet<Image> Image { get; set; }
    public DbSet<Message> Message { get; set; }
    public DbSet<Post> Post { get; set; }
    public DbSet<User> User { get; set; }
    public DbSet<ChatMessage> ChatMessage { get; set; }
    public DbSet<PostImage> PostImage { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        // The connection settings to the MySQL Server
        // IP: 127.0.0.1 - localhost
        // schema name: sep3db
        // user: root
        // password: 1234
        optionsBuilder.UseMySQL("server=127.0.0.1;database=sep3db;uid=root;pwd=1234;");
    }
    
    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Chat>()
            .HasOne(c => c.client)
            .WithMany()
            .HasForeignKey(c => c.clientID);
        
        modelBuilder.Entity<Chat>()
            .HasOne(c => c.landlord)
            .WithMany()
            .HasForeignKey(c => c.landlordID);
    }
}