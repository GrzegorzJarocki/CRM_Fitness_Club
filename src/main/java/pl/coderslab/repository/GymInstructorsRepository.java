package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.GymInstructors;

public interface GymInstructorsRepository extends JpaRepository<GymInstructors, Long> {


    GymInstructors findGymInstructorsById(Long id);

    @Query(value = "SELECT SUM(salary) FROM GymInstructors JOIN GymPayroll_GymInstructors ON  GymInstructors.id = GymPayroll_GymInstructors.gymInstructors_id WHERE GymPayroll_GymInstructors.gymPayroll_id =?",
            nativeQuery = true)
    double findPayrollByMonth(Long id);

}
