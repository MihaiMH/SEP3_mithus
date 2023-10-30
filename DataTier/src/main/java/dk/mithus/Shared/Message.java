package dk.mithus.Shared;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private Date time;
    @ManyToOne
    private User client;
    @ManyToOne
    private User landlord;

    public Message() {
    }

    public Message(Long id, String body, Date time) {
        this.id = id;
        this.body = body;
        this.time = time;
    }

    public Message(String body, Date time) {
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

    public void setBody(String body) {
        this.body = body;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public User getLandlord() {
        return landlord;
    }

    public void setLandlord(User landlord) {
        this.landlord = landlord;
    }
}
