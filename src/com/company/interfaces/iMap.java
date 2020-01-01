package com.company.interfaces;

import com.company.Level;

import java.util.ArrayList;

public interface iMap {
    /*
        Functions related to map making and editing.
     */
    void addLevel(Level l);
    ArrayList<Level> getLevels();
}
