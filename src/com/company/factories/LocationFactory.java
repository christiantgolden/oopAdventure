package com.company.factories;

import com.company.Location;
import com.company.locations.*;

public class LocationFactory {
    public Location spawnlLevel(String type){
        Location l = null;
        switch (type){
            case "Field":
                l = new Field();
                break;
            case "Water":
                l = new Water();
                break;
            case "Dungeon":
                l = new Dungeon();
                break;
            case "Mountain":
                l = new Mountain();
                break;
            case "Castle":
                l = new Castle();
                break;
        }
        return l;
    }
}
