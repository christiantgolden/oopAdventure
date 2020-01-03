package com.company;

import com.company.factories.*;
import com.company.locations.*;

public class Main {

    public static void main(String[] args) {
        Character hero = new CharacterFactory().spawnCharacter("Wizard", "Greg");

                /*
            TODO:
                1. World Generator
                    ~ a location is defined by a list of coordinates corresponding
                        to boundary.
                    ~ generates map consisting of locations
                        locations randomly generated/patched together
                        locations are populated with NPCs, creatures, buildings, weather
                    ~ generates weather events that may span several locations
                2. Event Automator
                    ~ start some threads (weather, NPC/creature movement)
                3. User Interface
                4. Game Start
         */




       /* Castle castle = new Castle();
        castle.generateBoundary();*/
    }
}