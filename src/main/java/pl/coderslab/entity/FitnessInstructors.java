package pl.coderslab.entity;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class FitnessInstructors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotNull
    private double salaryPerHour;
    @NotNull
    private int hours;
    private double salary;
    @ManyToMany(mappedBy = "fitnessInstructors",fetch = FetchType.EAGER)
    private List<FitnessPayroll> fitnessPayroll = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<FitnessPayroll> getFitnessPayroll() {
        return fitnessPayroll;
    }

    public void setFitnessPayroll(List<FitnessPayroll> fitnessPayroll) {
        this.fitnessPayroll = fitnessPayroll;
    }

    @Override
    public String toString() {
        return "FitnessInstructorsRepository{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salaryPerHour=" + salaryPerHour +
                ", hours=" + hours +
                '}';
    }
}
