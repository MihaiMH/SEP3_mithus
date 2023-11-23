package dk.via.mithus.Shared;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double area;
    private Integer maxTenants;
    private String creationDate;
    @ManyToOne(fetch = FetchType.EAGER)
    private HousingType type;
    @ManyToOne(fetch = FetchType.EAGER)
    private EnergyRating energyRating;
    @ManyToOne(fetch = FetchType.EAGER)
    private PostStatus status;
    @OneToOne(fetch = FetchType.EAGER)
    private Address address;
    @OneToOne(fetch = FetchType.EAGER)
    private Cost cost;
    @OneToMany(fetch = FetchType.EAGER)
    private Collection<Image> images;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Amenity> amenities;
    @ManyToOne
    private User landlord;

    public Post() {
        this.amenities = new ArrayList<>();
        this.images = new ArrayList<>();
    }

    public Post(String title, String description, Double area, Integer maxTenants, String creationDate) {
        this.title = title;
        this.description = description;
        this.area = area;
        this.maxTenants = maxTenants;
        this.creationDate = creationDate;
        this.amenities = new ArrayList<>();
        this.images = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getMaxTenants() {
        return maxTenants;
    }

    public void setMaxTenants(Integer maxTenants) {
        this.maxTenants = maxTenants;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public Collection<Image> getImages() {
        return images;
    }

    public void addImage(Image image) {
        this.images.add(image);
    }

    public void setImages(Collection<Image> images) {
        this.images = images;
    }

    public Collection<Amenity> getAmenities() {
        return amenities;
    }

    public void setAmenities(Collection<Amenity> amenities) {
        this.amenities = amenities;
    }

    public void addAmenity(Amenity amenity) {
        this.amenities.add(amenity);
    }

    public HousingType getType() {
        return type;
    }

    public void setType(HousingType type) {
        this.type = type;
    }

    public EnergyRating getEnergyRating() {
        return energyRating;
    }

    public void setEnergyRating(EnergyRating energyRating) {
        this.energyRating = energyRating;
    }

    public PostStatus getStatus() {
        return status;
    }

    public void setStatus(PostStatus status) {
        this.status = status;
    }

    public User getLandlord() {
        return landlord;
    }

    public void setLandlord(User landlord) {
        this.landlord = landlord;
    }
}
