package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.FitnessPayroll;

public interface FitnessPayrollRepository extends JpaRepository<FitnessPayroll, Long> {

    FitnessPayroll findFitnessPayrollById(Long id);
}
