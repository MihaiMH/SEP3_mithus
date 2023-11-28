package dk.via.mithus.Shared;

import jakarta.persistence.*;

@Entity
@Table(name = "energy_rating")
public class EnergyRating {
    @Id
    private Long id;
    @Column(unique = true)
    private String name;

    public EnergyRating() {
    }

    public EnergyRating(String name) {
        this.name = name;
    }

    public EnergyRating(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
