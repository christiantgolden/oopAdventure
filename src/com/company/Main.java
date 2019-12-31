package com.company;

import com.company.factories.CharacterFactory;
import com.company.factories.ItemFactory;

public class Main {

    public static void main(String[] args) {
        Item burger = new ItemFactory().spawnItem("Food", "Burger");
        Character h = new CharacterFactory().spawnHero("Wizard", "Gandalf");
        h.pickUp(burger);
        System.out.println("Name: " + h.getName() + " Location: " + h.getX() + "," + h.getY());
        System.out.println("moving right");
        h.moveRight();
        System.out.println("Name: " + h.getName() + " Location: " + h.getX() + "," + h.getY());

        System.out.println("moving down");
        h.moveDown();
        System.out.println("Name: " + h.getName() + " Location: " + h.getX() + "," + h.getY());

        System.out.println("moving left");
        h.moveLeft();
        System.out.println("Name: " + h.getName() + " Location: " + h.getX() + "," + h.getY());

        System.out.println("moving up");
        h.moveUp();
        System.out.println("Name: " + h.getName() + " Location: " + h.getX() + "," + h.getY());

        h.printInventory();
        Item bible = new ItemFactory().spawnItem("Book", "Bible");
        h.pickUp(bible);
        h.printInventory();

        System.out.println(bible.getName() + " x: " + bible.getX() + ", y: " + bible.getY());
        System.out.println(burger.getName() + " x: " + burger.getX() + ", y: " + burger.getY());
        h.drop(bible);
        h.printInventory();
        System.out.println(h.getInventory());
    }
}