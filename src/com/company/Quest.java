package com.company;

import com.company.interfaces.iQuest;

import java.time.Duration;
import java.time.OffsetTime;
import java.util.ArrayList;

public class Quest implements iQuest {
    private String name;
    private int level, earnableXP;
    private boolean isFinished;
    private OffsetTime deadline;

    private ArrayList<Location> locations = new ArrayList<>();
    private ArrayList<Character> characters = new ArrayList<>();//people involved in quest
    private ArrayList<Quest> subQuests = new ArrayList<>();

    @Override
    public void addQuest(Quest q) {
        this.subQuests.add(q);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFinished() {
        return this.isFinished;
    }

    @Override
    public void setFinished() {
        this.isFinished = true;
    }

    @Override
    public OffsetTime getDeadline() {
        return this.deadline;
    }

    @Override
    public void setDeadline(Duration d) {
        this.deadline = OffsetTime.now().plus(d);
    }

    @Override
    public void addLocation(Location l) {
        this.locations.add(l);
    }

    @Override
    public ArrayList<Location> getLocations() {
        return this.locations;
    }
    /*
        Maybe do HashMap or some sort of list of HashMaps consisting of ordered steps
        in the quest. <Integer, Quest> or something like that.
     */
}
