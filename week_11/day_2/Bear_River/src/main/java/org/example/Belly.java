package org.example;

import java.util.ArrayList;

public class Belly {
    private ArrayList<Salmon> belly;

    public Belly(){
        this.belly = new ArrayList<>();
    }
    public ArrayList<Salmon> getBelly() {
        return this.belly;
    }
    public void addFishToBelly(Salmon fish){
        this.belly.add(fish);
    }
}
