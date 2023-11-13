package dk.via.mithus.Shared;

import jakarta.persistence.*;

@Entity
@Table(name = "post_type")
public class PostType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;

    public PostType() {
    }

    public PostType(String name) {
        this.name = name;
    }

    public PostType(Long id, String name) {
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
