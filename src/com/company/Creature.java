package com.company;

import com.company.interfaces.iCreature;

public class Creature implements iCreature {
    private int level;
    private int health;
    private boolean isAlive = true;
    public boolean canFly = false;
    public boolean isRidable = false;

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel() {
        this.level = level;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth() {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void die() {
        this.isAlive = false;
    }
}
