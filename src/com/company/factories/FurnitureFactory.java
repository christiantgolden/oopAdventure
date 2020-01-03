package com.company.factories;

import com.company.Furniture;
import com.company.furniture.Bed;
import com.company.furniture.Desk;
import com.company.furniture.Table;

public class FurnitureFactory {
    public Furniture spawnFurniture(String type){
        Furniture f = null;
        switch (type){
            case "Table":
                f = new Table();
                f.hasStorage = true;
                break;
            case "Desk":
                f = new Desk();
                f.hasStorage = true;
                break;
            case "Bed":
                f = new Bed();
                break;
        }
        return f;
    }
}
