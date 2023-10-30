package dk.via.mithus.Shared;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String street;
    private Double area;
    private Integer maxTenants;
    private String energyRating;
    private Double deposit;
    private Double moveInPrice;
    private Double utilities;
    private LocalDateTime creationDate;
    private String status;
    private boolean isFurnished;
    private boolean hasBalcony;
    private boolean smokingAllowed;
    private boolean hasParking;
    private boolean hasDryer;
    private boolean hasMonthlyRent;
    @OneToMany
    private Collection<Image> images;
//    @ManyToOne
//    private User landlord;

    public Post() {
    }

    public Post(String title, String description, String street, Double area, Integer maxTenants, String energyRating, Double deposit, Double moveInPrice, Double utilities, boolean isFurnished, boolean hasBalcony, boolean smokingAllowed, boolean hasParking, boolean hasDryer, boolean hasMonthlyRent) {
        this.title = title;
        this.description = description;
        this.street = street;
        this.area = area;
        this.maxTenants = maxTenants;
        this.energyRating = energyRating;
        this.deposit = deposit;
        this.moveInPrice = moveInPrice;
        this.utilities = utilities;
        this.isFurnished = isFurnished;
        this.hasBalcony = hasBalcony;
        this.smokingAllowed = smokingAllowed;
        this.hasParking = hasParking;
        this.hasDryer = hasDryer;
        this.hasMonthlyRent = hasMonthlyRent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getEnergyRating() {
        return energyRating;
    }

    public void setEnergyRating(String energyRating) {
        this.energyRating = energyRating;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getMoveInPrice() {
        return moveInPrice;
    }

    public void setMoveInPrice(Double moveInPrice) {
        this.moveInPrice = moveInPrice;
    }

    public Double getUtilities() {
        return utilities;
    }

    public void setUtilities(Double utilities) {
        this.utilities = utilities;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean isHasDryer() {
        return hasDryer;
    }

    public void setHasDryer(boolean hasDryer) {
        this.hasDryer = hasDryer;
    }

    public boolean isHasMonthlyRent() {
        return hasMonthlyRent;
    }

    public void setHasMonthlyRent(boolean hasMonthlyRent) {
        this.hasMonthlyRent = hasMonthlyRent;
    }

    public Collection<Image> getImages() {
        return images;
    }

    public void setImages(Collection<Image> images) {
        this.images = images;
    }

//    public User getLandlord() {
//        return landlord;
//    }
//
//    public void setLandlord(User landlord) {
//        this.landlord = landlord;
//    }
}
