package dk.via.mithus.Shared;

import jakarta.persistence.*;

@Entity
@Table(name = "cost")
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double deposit;
    private double moveInPrice;
    private double utilities;
    private double monthlyRent;

    public Cost() {
    }

    public Cost(double deposit, double moveInPrice, double utilities, double monthlyRent) {
        this.deposit = deposit;
        this.moveInPrice = moveInPrice;
        this.utilities = utilities;
        this.monthlyRent = monthlyRent;
    }

    public Cost(Long id, double deposit, double moveInPrice, double utilities, double monthlyRent) {
        this.id = id;
        this.deposit = deposit;
        this.moveInPrice = moveInPrice;
        this.utilities = utilities;
        this.monthlyRent = monthlyRent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getMoveInPrice() {
        return moveInPrice;
    }

    public double getUtilities() {
        return utilities;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }
}
