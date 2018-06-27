package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.FitnessInstructors;

public interface FitnessInstructorsRepository extends JpaRepository<FitnessInstructors, Long> {


    FitnessInstructors findFitnessInstructorsById(Long id);

    @Query(value = "SELECT SUM(salary) FROM FitnessInstructors JOIN FitnessPayroll_FitnessInstructors ON  FitnessInstructors.id = FitnessPayroll_FitnessInstructors.fitnessInstructors_id WHERE FitnessPayroll_FitnessInstructors.fitnessPayroll_id =?",
            nativeQuery = true)
    double findPayrollByMonth(Long id);
}
