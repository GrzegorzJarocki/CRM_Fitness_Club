package pl.coderslab.entity;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class GymPayroll {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String month;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<GymInstructors> gymInstructors = new ArrayList<>();

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

    public List<GymInstructors> getGymInstructors() {
        return gymInstructors;
    }

    public void setGymInstructors(List<GymInstructors> gymInstructorsList) {
        this.gymInstructors = gymInstructorsList;
    }

    @Override
    public String toString() {
        return "GymPayroll{" +
                "id=" + id +
                ", month='" + month + '\'' +
                ", gymInstructorsList=" + gymInstructors +
                '}';
    }
}
