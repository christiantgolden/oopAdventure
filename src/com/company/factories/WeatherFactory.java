package com.company.factories;

import com.company.Weather;
import com.company.weather.*;

public class WeatherFactory {
    public Weather spawnWeather(String type){
        Weather w = null;
        switch (type){
            case "Clear":
                w = new Clear();
                break;
            case "Cloudy":
                w = new Cloudy();
                break;
            case "Hurricane":
                w = new Hurricane();
                w.isDisaster = true;
                break;
            case "Rain":
                w = new Rain();
                break;
            case "Snow":
                w = new Snow();
                break;
            case "Tornado":
                w = new Tornado();
                w.isDisaster = true;
                break;
        }
        return w;
    }

}
