package dk.via.mithus.Shared;

import jakarta.persistence.*;

@Entity
@Table(name = "housing_type")
public class HousingType {
    // TODO: Hardcode housing type, when server starts check if there are any housing types in the database, if not, create them.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;

    public HousingType() {
    }

    public HousingType(String name) {
        this.name = name;
    }

    public HousingType(Long id, String name) {
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
