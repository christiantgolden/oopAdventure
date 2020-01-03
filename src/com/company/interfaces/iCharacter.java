package com.company.interfaces;

import com.company.Attack;
import com.company.Quest;

import java.util.ArrayList;

public interface iCharacter {
    void setName(String name);
    String getName();
    void setX(int x);
    int getX();
    void setY(int y);
    int getY();
    void moveRight();
    void moveLeft();
    void moveUp();
    void moveDown();
    void generateLocation();
    int getLevel();
    void setLevel(int level);
    void levelUp();
    int getXP();
    void setXP(int xp);
    int getEnergy();
    void setEnergy(int energy);
    Boolean hasAttack(Attack a);
    void learnAttack(Attack a);
    int getHealth();
    void takeDamage(int damage);
    void heal(int healing);
    ArrayList<Quest> getQuests();
    void addQuest(Quest q);
    void jump();
    void run();
    Boolean isJumping();
    Boolean isRunning();
    void walk();
    void sleep();
    Boolean isWalking();
    Boolean isSleeping();
    Boolean isAlive();
    void die();
    void encounterQuest(Quest q);//allows Character to choose whether or not to add quest.
}
