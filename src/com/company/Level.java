package com.company;

import com.company.interfaces.iLevel;

import java.util.ArrayList;

public class Level implements iLevel {
    private String type; //Castle, Dungeon, Field, Mountain, etc.
    private int level; //level of difficulty
    private int size; //square feet
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Creature> creatures = new ArrayList<>();
    private ArrayList<Character> characters = new ArrayList<>();

    @Override
    public void setLevel(int level) {//level of difficulty
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void addItem(Item i) {
        this.items.add(i);
    }

    @Override
    public ArrayList<Item> getItems() {
        return this.items;
    }

    @Override
    public Item removeItem(Item i) {
        Item removed = null;
        if(this.items.contains(i)){
            removed = i;
            this.items.remove(i);
        }
        return removed;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void addCreature(Creature c) {
        this.creatures.add(c);
    }

    @Override
    public ArrayList<Creature> getCreatures() {
        return this.creatures;
    }

    @Override
    public void addCharacter(Character c) {
        this.characters.add(c);
    }

    @Override
    public ArrayList<Character> getCharacters() {
        return this.characters;
    }
}
