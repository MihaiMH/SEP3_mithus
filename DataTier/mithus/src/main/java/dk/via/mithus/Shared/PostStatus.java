package dk.via.mithus.Shared;

import jakarta.persistence.*;

@Entity
@Table(name = "post_status")
public class PostStatus {
    // TODO: Hardcode post status, when server starts check if there are any post statuses in the database, if not, create them.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String status;

    public PostStatus() {
    }

    public PostStatus(String status) {
        this.status = status;
    }

    public PostStatus(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
