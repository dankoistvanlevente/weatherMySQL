package hu.weatherMySQL.repositories;

import hu.weatherMySQL.domain.Dailyweather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<Dailyweather, Integer> {

    public List<Dailyweather> findAllByOrderByTemperatureAsc();


    @Query(value="SELECT * FROM dailyweather WHERE temperature >= ?1", nativeQuery = true)
    public List<Dailyweather> getHotEffects(int temp);
}
