package com.company.factories;

import com.company.Character;
import com.company.characters.*;

public class CharacterFactory {
    public Character spawnCharacter(String race, String name){
        Character c = null;
        switch (race){
            case "Wizard":
                c = new Wizard(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Warrior":
                c = new Warrior(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Monk":
                c = new Monk(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Dragonborn":
                c = new Dragonborn(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Priest":
                c = new Priest(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Berserker":
                c = new Berserker(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Elf":
                c = new Elf(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Bard":
                c = new Bard(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Samurai":
                c = new Samurai(name);
                c.setRace(race);
                c.generateLocation();
                break;
            case "Hacker":
                c = new Hacker(name);
                c.setRace(race);
                c.generateLocation();
                break;
        }
        return c;
    }
}
