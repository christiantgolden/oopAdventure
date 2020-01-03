package com.company.interfaces;

import com.company.Location;
import com.company.Quest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;

public interface iQuest {
    void addQuest(Quest q);
    String getName();
    boolean isFinished();
    void setFinished();//set finished to true
    OffsetTime getDeadline();
    void setDeadline(Duration d);
    void addLocation(Location l);
    ArrayList<Location> getLocations();
}
