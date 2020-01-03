package com.company.factories;

import com.company.God;
import com.company.gods.*;

public class GodFactory {
    public God spawnGod(String name){
        God g = null;
        switch (name){
            case "Commerce":
                g = new Commerce();
                break;
            case "Friendship":
                g = new Friendship();
                break;
            case "Love":
                g = new Love();
                break;
            case "Lust":
                g = new Lust();
                break;
            case "Mercy":
                g = new Mercy();
                break;
            case "Revenge":
                g = new Revenge();
                break;
            case "War":
                g = new War();
                break;
        }
        return g;
    }
}
