package com.company.factories;

import com.company.Attack;
import com.company.attacks.*;

public class AttackFactory {
    public Attack learnAttack(String type, String name){
        Attack a = null;
        switch(type){
            case "Slice":
                a = new Slice(name);
                break;
            case "HammerStrike":
                a = new HammerStrike(name);
                break;
            case "DoubleStrike":
                a = new DoubleStrike(name);
                break;
        }
        return a;
    }
}
