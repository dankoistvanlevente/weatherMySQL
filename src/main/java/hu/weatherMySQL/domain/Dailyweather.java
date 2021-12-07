package hu.weatherMySQL.domain;

import javax.persistence.*;

@Entity
public class Dailyweather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String effect;
     private int temperature;
     @ManyToOne
     private Wind wind;

     public Dailyweather(){

     }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
