package com.company.factories;

import com.company.Item;
import com.company.items.*;

public class ItemFactory {
    public Item spawnItem(String type, String name){
        Item i = null;
        switch (type){
            case "Weapon":
                i = new Weapon(name);
                i.isEquippable = true;
                i.generateLocation();
                break;
            case "Potion":
                i = new Potion(name);
                i.isDrinkable = true;
                i.generateLocation();
                break;
            case "Armor":
                i = new Armor(name);
                i.isWearable = true;
                i.generateLocation();
                break;
            case "Food":
                i = new Food(name);
                i.isEdible = true;
                i.generateLocation();
                break;
            case "Jewelry":
                i = new Jewelry(name);
                i.isWearable = true;
                i.generateLocation();
                break;
            case "Ingredient":
                i = new Ingredient(name);
                i.generateLocation();
                break;
            case "Book":
                i = new Book(name);
                i.isReadable = true;
                i.generateLocation();
                break;
        }
        return i;
    }
}
