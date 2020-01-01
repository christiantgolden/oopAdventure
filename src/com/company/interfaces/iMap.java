package com.company.interfaces;

import com.company.Location;

import java.util.ArrayList;

public interface iMap {
    /*
        Functions related to map making and editing.
     */
    void addLocation(Location l);
    ArrayList<Location> getLocations();
}
