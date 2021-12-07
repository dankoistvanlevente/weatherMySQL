package hu.weatherMySQL.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String direction;
    private int velocity;
    @OneToMany(mappedBy="wind")
    @JsonIgnore
    List<Dailyweather> weatherlist;

    public Wind() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public List<Dailyweather> getWeatherlist() {
        return weatherlist;
    }

    public void setWeatherlist(List<Dailyweather> weatherlist) {
        this.weatherlist = weatherlist;
    }
}
