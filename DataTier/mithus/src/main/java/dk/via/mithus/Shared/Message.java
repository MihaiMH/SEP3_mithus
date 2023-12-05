package dk.via.mithus.Shared;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private String time;
    @ManyToOne
    private User user;

    public Message() {
    }

    public Message(Long id, String body, String time) {
        this.id = id;
        this.body = body;
        this.time = time;
    }

    public Message(String body, String time) {
        this.body = body;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public String getTime() {
        return time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
