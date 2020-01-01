package com.company.levels;

import com.company.Level;

import java.util.ArrayList;
import java.util.HashMap;

public class Castle extends Level {
    private HashMap<Integer,ArrayList<Room>> blueprint = new HashMap<>();

    public void addFloor(){
        this.blueprint.put(this.blueprint.size()+1, new ArrayList<Room>());
    }

    public void addRoom(int floor, Room r){
        this.blueprint.get(floor).add(r);
    }


}
