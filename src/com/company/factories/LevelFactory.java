package com.company.factories;

import com.company.Level;
import com.company.levels.*;

public class LevelFactory {
    public Level spawlLevel(String type){
        Level l = null;
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
