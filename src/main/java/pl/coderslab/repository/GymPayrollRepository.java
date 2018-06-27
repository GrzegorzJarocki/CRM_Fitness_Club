package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.GymPayroll;

public interface GymPayrollRepository extends JpaRepository<GymPayroll, Long> {

    GymPayroll findGymPayrollById(Long id);

}
