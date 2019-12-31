package com.company;

import com.company.interfaces.iItem;

import java.util.Random;

public class Item implements iItem {
    private int x;
    private int y;
    private int weight;
    private int worth;
    private char rarity;
    public String name;
    public Boolean isDrinkable = false;
    public Boolean isWearable = false;
    public Boolean isEquippable = false;
    public Boolean isEdible = false;
    public Boolean isReadable = false;

    @Override
    public void setWorth(int worth) {
        this.worth = worth;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void generateLocation() {
        Random r = new Random();
        this.setX(Math.abs(r.nextInt() % 100));
        this.setY(Math.abs(r.nextInt() % 100));
    }

    @Override
    public int getWorth() {
        return this.worth;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName() {
        this.name = name;
    }

    @Override
    public void setRarity(char rarity) {
        this.rarity = rarity;
    }

    @Override
    public char getRarity() {
        return this.rarity;
    }
}
