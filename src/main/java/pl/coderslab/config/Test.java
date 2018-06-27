package pl.coderslab.config;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
       // LocalDate date = LocalDate.now();

         LocalDate start = LocalDate.now().plusMonths(8).withDayOfMonth(1);

         LocalDate finish = LocalDate.now().plusMonths(9).withDayOfMonth(1).minusDays(1);

        System.out.println(finish);
    }


   // GI:<form:select items="${gymInstructorss}" path="gymInstructorsList.id" itemValue="id" itemLabel="lastName" />
//SELECT SUM(salary) FROM GymInstructors JOIN GymPayroll_GymInstructors WHERE GymInstructors.id = GymPayroll_GymInstructors.gymInstructors_id;
}


