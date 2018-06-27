package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.Gym;

public interface GymRepository extends JpaRepository<Gym, Long> {


    Gym findGymById (Long id);



    @Query(value = "SELECT COUNT(*) FROM Gym WHERE start >= ? AND start <= ?",
            nativeQuery = true)
    int findCountAllGymPasses(String data1, String data2);

    @Query(value = "SELECT SUM(price) FROM Gym WHERE start >= ? AND start <= ?",
            nativeQuery = true)
    double findSumAllGymPasses(String data1, String data2);
}
