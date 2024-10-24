package com.FreightFox.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherRepository weatherRepository;

    @GetMapping
    public List<Weather> getAllWeather() {
        return weatherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Weather getWeatherById(@PathVariable Long id) {
        return weatherRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Weather createWeather(@RequestBody Weather weather) {
        return weatherRepository.save(weather);
    }

    @PutMapping("/{id}")
    public Weather updateWeather(@PathVariable Long id, @RequestBody Weather weather) {
        weather.setId(id);
        return weatherRepository.save(weather);
    }

    @DeleteMapping("/{id}")
    public void deleteWeather(@PathVariable Long id) {
        weatherRepository.deleteById(id);
    }
}
