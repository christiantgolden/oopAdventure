package com.company.factories;

import com.company.Spell;
import com.company.spells.*;

public class SpellFactory {
    public Spell learnSpell(String type, String name){
        Spell s = null;
        switch (type){
            case "Fire":
                s = new Fire(name);
                break;
            case "Ice":
                s = new Ice(name);
                break;
            case "Lightning":
                s = new Lightning(name);
                break;
        }
        return s;
    }

}
