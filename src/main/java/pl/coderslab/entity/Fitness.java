package pl.coderslab.entity;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table
public class Fitness {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private int hours;
    @NotNull
    private double pricePerHour =25;
    @NotNull
    private double finalPrice;

    private LocalDate start = LocalDate.now().plusMonths(1).withDayOfMonth(1);

    private LocalDate finish = LocalDate.now().plusMonths(2).withDayOfMonth(1).minusDays(1);

    private String opinion;

    @ManyToOne
    @LazyCollection(LazyCollectionOption.FALSE)
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getFinish() {
        return finish;
    }

    public void setFinish(LocalDate finish) {
        this.finish = finish;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Fitness{" +
                "id=" + id +
                ", hours=" + hours +
                ", pricePerHour=" + pricePerHour +
                ", finalPrice=" + finalPrice +
                ", start=" + start +
                ", finish=" + finish +
                ", opinion='" + opinion + '\'' +
                ", client=" + client +
                '}';
    }
}
