package com.company;

import com.company.interfaces.iWeather;

import java.util.ArrayList;

public class Weather implements iWeather {
    private int duration;
    private int remainingTime;
    /*
        add timestamp for start time
     */
    private int intensity;
    private ArrayList<Level> areas = new ArrayList<>();

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return this.duration;
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
        /*

         */
        for(Level l: this.areas){
            l.addWeatherEvent(newWeatherEvent);
        }
    }

    @Override
    public void move(String direction) {
        //TODO
    }

    @Override
    public ArrayList<Level> getAreas() {
        return this.areas;
    }

    @Override
    public void addLocation(Level l) {
        this.areas.add(l);
    }
}
