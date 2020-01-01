package com.company;

import com.company.interfaces.iQuest;

import java.util.ArrayList;

public class Quest implements iQuest {
    private String name;
    private int level, earnableXP;
    private boolean isFinished;

    private ArrayList<Level> levels = new ArrayList<>();
    private ArrayList<Character> characters = new ArrayList<>();//people involved in quest
    private ArrayList<Quest> subQuests = new ArrayList<>();

    @Override
    public void addQuest(Quest q) {
        this.subQuests.add(q);
    }
    /*
        Maybe do HashMap or some sort of list of HashMaps consisting of ordered steps
        in the quest. <Integer, Quest> or something like that.
     */
}
