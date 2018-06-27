package pl.coderslab.entity;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class FitnessPayroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String month;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<FitnessInstructors> fitnessInstructors = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<FitnessInstructors> getFitnessInstructors() {
        return fitnessInstructors;
    }

    public void setFitnessInstructors(List<FitnessInstructors> fitnessInstructors) {
        this.fitnessInstructors = fitnessInstructors;
    }

    @Override
    public String toString() {
        return "FitnessPayroll{" +
                "id=" + id +
                ", month='" + month + '\'' +
                ", fitnessInstructors=" + fitnessInstructors +
                '}';
    }
}
