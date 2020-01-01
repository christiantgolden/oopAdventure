package com.company.factories;

import com.company.Creature;
import com.company.creatures.Dragon;
import com.company.creatures.Giant;
import com.company.creatures.Goblin;
import com.company.creatures.Troll;

public class CreatureFactory {
    public Creature spawnCreature(String type){
        Creature c = null;
        switch (type){
            case "Dragon":
                c = new Dragon();
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
        }
        return c;
    }
}
