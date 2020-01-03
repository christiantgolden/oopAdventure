package com.company.interfaces;

import com.company.Location;
import com.company.Weather;

import java.time.Duration;
import java.time.OffsetTime;
import java.util.ArrayList;

public interface iWeather {
    void setDuration(Duration duration);
    int getDuration();
    void setIntensity(int intensity);
    int getIntensity();
    void setRemainingTime(int remainingTime);
    int getRemainingTime();
    void interrupt(Weather newWeatherEvent);
    void move(String direction);
    ArrayList<Location> getAreas();
    void addLocation(Location l);
    void setStartTime();
    OffsetTime getStartTime();
    void setEndTime(Duration duration);
    OffsetTime getEndTime();
}
