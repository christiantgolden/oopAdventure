package com.company.interfaces;

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
}
