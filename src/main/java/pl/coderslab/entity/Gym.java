package pl.coderslab.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price = 129;

   // private Date created = new Date();
  //  LocalDate date = LocalDate.now();
    private LocalDate start = LocalDate.now();

  //  LocalDate date2 = LocalDate.now().plusDays(30);
    private LocalDate finish = LocalDate.now().plusDays(30);

    private String opinion;

    @ManyToOne(fetch = FetchType.EAGER)
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return "Gym{" +
                "id=" + id +
                ", price=" + price +
                ", start=" + start +
                ", finish=" + finish +
                ", opinion='" + opinion + '\'' +
                ", client=" + client +
                '}';
    }
}
