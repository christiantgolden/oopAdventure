package com.company;

import com.company.interfaces.iWeather;

import java.time.Duration;
import java.time.OffsetTime;
import java.util.ArrayList;

public class Weather implements iWeather {
    private Duration duration;
    private int remainingTime;
    private OffsetTime startTime;
    private OffsetTime endTime;
    public boolean isDisaster = false;
    private int intensity;
    private ArrayList<Location> areas = new ArrayList<>();

    @Override
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return this.duration.toMillisPart();
    }

    @Override
    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public int getIntensity() {
        return this.intensity;
    }

    @Override
    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    @Override
    public int getRemainingTime() {
        return this.remainingTime;
    }

    @Override
    public void interrupt(Weather newWeatherEvent) {
        for(Location l: this.areas){
            l.addWeatherEvent(newWeatherEvent);
        }
    }

    @Override
    public void move(String direction) {
        //TODO
    }

    @Override
    public ArrayList<Location> getAreas() {
        return this.areas;
    }

    @Override
    public void addLocation(Location l) {
        this.areas.add(l);
    }

    @Override
    public void setStartTime() {
        this.startTime = OffsetTime.now();
    }

    @Override
    public OffsetTime getStartTime() {
        return this.startTime;
    }

    @Override
    public void setEndTime(Duration duration) {
        this.endTime = this.startTime.plus(duration);
    }

    @Override
    public OffsetTime getEndTime() {
        return this.endTime;
    }
}
