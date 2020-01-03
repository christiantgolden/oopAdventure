package com.company.interfaces;

import com.company.*;
import com.company.Character;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.HashMap;

public interface iLocation {
    void setLevel(int level); //level of difficulty
    int getLevel(); //level of difficulty
    void addItem(Item i);
    ArrayList<Item> getItems();
    Item removeItem(Item i);
    void setLocationType(String type);
    String getLocationType();
    int getLocationSize();
    void setLocationSize(int size);
    void addCreature(Creature c);
    ArrayList<Creature> getCreatures();
    void addCharacter(Character c);
    ArrayList<Character> getCharacters();
    void addFurniture(Furniture f);
    ArrayList<Furniture> getFurniture();
    void addWeatherEvent(Weather w);
    Weather getWeather();
    void generateBoundary();
    HashMap<String, int[]> getBoundary();
    void printBoundary();
    void drawBoundary();
}
