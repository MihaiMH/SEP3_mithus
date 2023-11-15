namespace Domain.Models;

public class Address
{
    public long ID { get; set; }
    public string Street { get; set; }
    public string City { get; set; }
    public string Country { get; set; }
    public string Zipcode { get; set; }
}