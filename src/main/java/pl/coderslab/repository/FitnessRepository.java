package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.Fitness;

public interface FitnessRepository extends JpaRepository<Fitness, Long> {


    Fitness findFitnessById(Long id);

    @Query(value = "SELECT COUNT(*) FROM Fitness WHERE start >= ? AND start <= ?",
            nativeQuery = true)
    int findCountAllFitnessPasses(String data1, String data2);

    @Query(value = "SELECT SUM(finalPrice) FROM Fitness WHERE start >= ? AND start <= ?",
            nativeQuery = true)
    double findSumAllFitnessPasses(String data1, String data2);
}
