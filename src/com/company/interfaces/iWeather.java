package com.company.interfaces;

import com.company.Location;
import com.company.Weather;

import java.util.ArrayList;

public interface iWeather {
    void setDuration(int duration);
    int getDuration();
    void setIntensity(int intensity);
    int getIntensity();
    void setRemainingTime(int remainingTime);
    int getRemainingTime();
    void interrupt(Weather newWeatherEvent);
    void move(String direction);
    ArrayList<Location> getAreas();
    void addLocation(Location l);
}
