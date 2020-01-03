package com.company.factories;

import com.company.Creature;
import com.company.creatures.*;

public class CreatureFactory {
    public Creature spawnCreature(String type){
        Creature c = null;
        switch (type){
            case "Dragon":
                c = new Dragon();
                c.canFly = true;
                c.isRidable = true;
                break;
            case "Giant":
                c = new Giant();
                break;
            case "Goblin":
                c = new Goblin();
                break;
            case "Troll":
                c = new Troll();
                break;
            case "Horse":
                c = new Horse();
                c.isRidable = true;
                break;
        }
        return c;
    }
}
