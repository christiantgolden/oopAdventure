package com.company.factories;

import com.company.Character;
import com.company.characters.*;

public class CharacterFactory {
    public Character spawnHero(String race, String name){
        Character c = null;
        switch (race){
            case "Wizard":
                c = new Wizard(name);
                c.generateLocation();
                break;
            case "Warrior":
                c = new Warrior(name);
                c.generateLocation();
                break;
            case "Monk":
                c = new Monk(name);
                c.generateLocation();
                break;
            case "Dragonborn":
                c = new Dragonborn(name);
                c.generateLocation();
                break;
            case "Priest":
                c = new Priest(name);
                c.generateLocation();
                break;
            case "Berserker":
                c = new Berserker(name);
                c.generateLocation();
                break;
        }
        return c;
    }
}
