package hu.weatherMySQL.services;

import hu.weatherMySQL.domain.Dailyweather;
import hu.weatherMySQL.repositories.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository repository;

    public List<Dailyweather> getEffects() {
        return repository.getHotEffects(20);
    }
}
