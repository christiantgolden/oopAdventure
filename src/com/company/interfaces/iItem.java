package com.company.interfaces;

public interface iItem {
    void setWorth(int worth);
    void setX(int x);
    void setY(int y);
    void generateLocation();
    int getWorth();
    int getY();
    int getX();
    void setWeight(int weight);
    int getWeight();
    String getName();
    void setName();
    void setRarity(char rarity);
    char getRarity();
}
