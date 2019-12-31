package com.company;

import java.util.ArrayList;

public class SpellCaster extends Character {
    public ArrayList<Spell> spells = new ArrayList<>();

    public void castSpell(Spell spell, Character target) {
        if(this.spells.contains(spell)){
            System.out.println(this.getName() + " is casting: " + spell.getName() + " at " + target.getName());
        }
    }

    public void learnSpell(Spell spell) {
        this.spells.add(spell);
    }

    public void printSpells() {
        System.out.print("Spells: ");
        for(Spell s: this.spells){
            System.out.print(s + " ");
        } System.out.println();
    }
}
