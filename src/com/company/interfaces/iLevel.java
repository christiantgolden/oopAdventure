package com.company.interfaces;

import com.company.Creature;
import com.company.Item;

import java.util.ArrayList;

public interface iLevel {
    void setLevel(int level); //level of difficulty
    int getLevel(); //level of difficulty
    void addItem(Item i);
    ArrayList<Item> getItems();
    Item removeItem(Item i);
    void setType(String type);
    String getType();
    int getSize();
    void setSize(int size);
    void addCreature(Creature c);
    ArrayList<Creature> getCreatures();
}
