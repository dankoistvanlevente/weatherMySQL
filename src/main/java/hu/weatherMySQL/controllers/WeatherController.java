package hu.weatherMySQL.controllers;

import hu.weatherMySQL.domain.Dailyweather;
import hu.weatherMySQL.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService service;

    @GetMapping("effects")
    public List<Dailyweather> getEffects(){
        return service.getEffects();
    }
}
