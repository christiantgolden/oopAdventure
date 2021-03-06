package com.company;

import com.company.interfaces.iLocation;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Location extends JFrame implements iLocation {
    private String type; //Castle, Dungeon, Field, Mountain, etc.
    private int level; //level of difficulty
    private int size; //square feet
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Creature> creatures = new ArrayList<>();
    private ArrayList<Character> characters = new ArrayList<>();
    private ArrayList<Furniture> furniture = new ArrayList<>();
    private Weather weather;
    private HashMap<String, int[]> boundary = new HashMap<>();
    private int[] topLeft = new int[2];
    private int[] topRight = new int[2];
    private int[] bottomRight = new int[2];
    private int[] bottomLeft = new int[2];

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
    public void setLocationType(String type) {
        this.type = type;
    }

    @Override
    public String getLocationType() {
        return this.type;
    }

    @Override
    public int getLocationSize() {
        return this.size;
    }

    @Override
    public void setLocationSize(int size) {
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

    @Override
    public void addFurniture(Furniture f) {
        this.furniture.add(f);
    }

    @Override
    public ArrayList<Furniture> getFurniture() {
        return this.furniture;
    }

    @Override
    public void addWeatherEvent(Weather w) {
        this.weather = w;
    }

    @Override
    public Weather getWeather() {
        return this.weather;
    }

    @Override
    public void generateBoundary() {
        //TODO
        /*
            generate several random triangles at random locations,
            interconnected with lines drawn between points.

            1. Generate triangle of random sizes/angles at a random point
            2. draw line from last drawn triangle point.
                ~ line should not cross any other lines
                    ? if x within prev line xs, make sure y doesn't exceed min of prev ys.
                    ? if y within prev line ys, make sure x doesn't exceed min of prev xs.
            3. repeat at end of new line after shifting the starting angle
         */
        class Draw extends JComponent{
            Random rand = new Random();
            int FirstLinex1 = Math.abs(rand.nextInt(300));
            int FirstLinex2 = Math.abs(rand.nextInt(300));
            int FirstLiney1 = Math.abs(rand.nextInt(300));
            int FirstLiney2 = Math.abs(rand.nextInt(300));
            int SecondLinex1 = FirstLinex2;
            int SecondLinex2 = Math.abs(rand.nextInt(300));
            int SecondLiney1 = FirstLiney2;
            int SecondLiney2 = Math.abs(rand.nextInt(300));
            int ThirdLinex1 = SecondLinex2;
            int ThirdLinex2 = FirstLinex1;
            int ThirdLiney1 = SecondLiney2;
            int ThirdLiney2 = FirstLiney1;
            public void paint(Graphics g){
                Graphics2D graph2 = (Graphics2D)g;
                graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                Shape drawLine1 = new Line2D.Float(this.FirstLinex1, this.FirstLiney1,
                        this.FirstLinex2, this.FirstLiney2);
                graph2.draw(drawLine1);
                Shape drawLine2 = new Line2D.Float(this.SecondLinex1, this.SecondLiney1,
                        this.SecondLinex2, this.SecondLiney2);
                graph2.draw(drawLine2);
                Shape drawLine3 = new Line2D.Float(this.ThirdLinex1, this.ThirdLiney1,
                        this.ThirdLinex2, this.ThirdLiney2);
                graph2.draw(drawLine3);

                graph2.setColor(Color.red);
            }
        }
        this.setSize(500,500);
        this.setTitle("Drawing Shapes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Draw(), BorderLayout.CENTER);
        this.setVisible(true);
        /*
            Ooooo maybe generate interconnected triangles! 3points
         */
    }

    @Override
    public HashMap<String, int[]> getBoundary() {
        return this.boundary;
    }

    @Override
    public void printBoundary() {
        for(String key: this.boundary.keySet()) {
            System.out.println(key + ": " + this.boundary.get(key)[0] + "," + this.boundary.get(key)[1]);
        }
    }

    @Override
    public void drawBoundary() {

    }

}
