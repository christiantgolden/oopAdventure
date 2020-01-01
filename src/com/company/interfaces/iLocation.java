package com.company.interfaces;

import com.company.*;
import com.company.Character;

import java.util.ArrayList;

public interface iLocation {
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
    void addCharacter(Character c);
    ArrayList<Character> getCharacters();
    void addFurniture(Furniture f);
    ArrayList<Furniture> getFurniture();
    void addWeatherEvent(Weather w);
    Weather getWeather();
}
