package com.company.characters;

import com.company.Character;

public class Robot extends Character {
    private boolean isCharged = true;
    private boolean needsCharge = false;
    private int remainingBattery = 100;

    public Robot(String name){
        this.setName(name);
        this.isCharged = true;
        this.needsCharge = false;
        this.remainingBattery = 100;
    }

    public void drainBattery(int amount){
        if(remainingBattery > 0) {
            this.remainingBattery -= amount;
            if (remainingBattery <= 0) {
                this.remainingBattery = 0;
                this.needsCharge = true;
            }
        }
    }

    public int getRemainingBattery(){
        return this.remainingBattery;
    }

    public void chargeBattery(int amount){
        if(this.remainingBattery < 100) {
            this.remainingBattery += amount;
            if(this.remainingBattery >= 100){
                this.remainingBattery = 100;
                this.isCharged = true;
            }
        }
    }



}
