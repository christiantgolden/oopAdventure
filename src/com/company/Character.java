package com.company;

import com.company.interfaces.iCharacter;
import com.company.items.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Character implements iCharacter {
    /*
        Maybe this class should extend Creature?
        Every Character is a creature, but not every creature
        is a character.
     */
    private String name;
    private int x, y, health = 100, level = 1, xp = 0, energy = 100;
    private boolean isJumping = false, isWalking = false, isSleeping = false, isRunning = false, isAlive = true;
    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Quest> quests = new ArrayList<>();
    private ArrayList<Attack> attacks = new ArrayList<>();
    private HashMap<String, Boolean> outfit = new HashMap<>();
    private HashMap<String, Boolean> weapons = new HashMap<>();

    public Boolean isWearing(Armor a){
        if(outfit.get(a.getName())){
            System.out.println("Already wearing: " + a.getName());
            return true;
        } else {
            return false;
        }
    }

    public void pickUp(Item i){
        this.inventory.add(i);
    }

    public void drop(Item i){
        if(this.inventory.contains(i)) {
            this.inventory.remove(i);
        } else {
            System.out.println("No such item in inventory!");
        }
    }

    public ArrayList<Item> getInventory(){
        return this.inventory;
    }

    public void printInventory(){
        for(Item i: this.inventory) {
            System.out.print(i.getName() + " ");
        } System.out.println();
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void moveRight() {
        this.x += 1;
    }

    @Override
    public void moveLeft() {
        this.x -= 1;
    }

    @Override
    public void moveUp() {
        this.y += 1;
    }

    @Override
    public void moveDown() {
        this.y -= 1;
    }

    @Override
    public void generateLocation() {
        Random r = new Random();
        this.setX(Math.abs(r.nextInt() % 100));
        this.setY(Math.abs(r.nextInt() % 100));
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void levelUp() {
        this.level++;
    }

    @Override
    public int getXP() {
        return this.xp;
    }

    @Override
    public void setXP(int xp) {
        this.xp = xp;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public Boolean hasAttack(Attack a) {
        boolean answer = false;
        if(this.attacks.contains(a)){
            answer = true;
        }
        return answer;
    }

    @Override
    public void learnAttack(Attack a) {
        if (!this.attacks.contains(a)) {
            this.attacks.add(a);
        }
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public void heal(int healing) {
        this.health += healing;
    }

    @Override
    public ArrayList<Quest> getQuests() {
        return this.quests;
    }

    @Override
    public void addQuest(Quest q) {
        this.quests.add(q);
    }

    @Override
    public void jump() {
        this.isJumping = true;
    }

    @Override
    public void run() {
        this.isRunning = true;
    }

    @Override
    public Boolean isJumping() {
        return this.isJumping;
    }

    @Override
    public Boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public void walk() {
        this.isWalking = true;
    }

    @Override
    public void sleep() {
        this.isSleeping = true;
    }

    @Override
    public Boolean isWalking() {
        return this.isWalking;
    }

    @Override
    public Boolean isSleeping() {
        return this.isSleeping;
    }

    @Override
    public Boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void die() {
        this.isAlive = false;
    }

    @Override
    public void encounterQuest(Quest q) {
        System.out.println("Accept quest (" + q.getName() + "): ");
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        if(choice.toLowerCase() == "yes"){
            this.addQuest(q);
        }
    }

    public void attack(Attack a, Character target) {
        if(this.hasAttack(a)) {
            System.out.println(this.getName() + " is attacking " + target.getName());
        } else {
            System.out.println("Attack not available.");
        }
    }

    public void eat(Item i) {
        if (this.inventory.contains(i)) {
            System.out.println(this.getName() + " is ate: " + i.getName());
            this.inventory.remove(i);
        } else {
            System.out.println(i.getName() + " is not in inventory.");
        }

    }

    public void drink(Item i) {
        if (this.inventory.contains(i)) {
            System.out.println(this.getName() + " is drinking " + i.getName());
            this.inventory.remove(i);
        } else {
            System.out.println(i.getName() + " is not in inventory.");
        }
    }

    public void wear(Armor a) {
        if (this.inventory.contains(a) && !this.isWearing(a)) {
            System.out.println("Now wearing " + a.getName());
        } else if (this.isWearing(a)){
            System.out.println(a.getName() + " already being worn.");
        } else {
            System.out.println("Don't have " + a.getName());
        }
    }

    public void takeOff(Armor a){
        if(this.isWearing(a)){
            this.outfit.replace(a.getName(),false);
        } else {
            System.out.println("Not currently wearing: " + a.getName());
        }
    }

    public void equip(Weapon w) {
        if (this.weapons.get(w.getName())) {
            System.out.println("Already equipped: " + w.getName());
        } else if (this.inventory.contains(w)){
            this.weapons.put(w.getName(), true);
        } else {
            System.out.println("Don't have " + w.getName());
        }
    }

    public void unequip(Weapon w) {
        if(this.weapons.get(w.getName())){
            this.weapons.replace(w.getName(),false);
        } else if (!this.inventory.contains(w)) {
            System.out.println("Don't have " + w.getName());
        } else{
            System.out.println(w.getName() + " not equipped.");
        }
    }
}
