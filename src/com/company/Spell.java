package com.company;

import com.company.interfaces.iSpell;

public class Spell extends Attack implements iSpell {
    private String type; //fire, ice, lightning, etc.
    private int duration, manaCost;

    public void setType(String type){
        this.type = type;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public String getType(){
        return this.type;
    }

    public int getDuration(){
        return this.duration;
    }

    @Override
    public int getManaCost() {
        return this.manaCost;
    }

    @Override
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
}
