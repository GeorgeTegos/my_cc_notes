package org.example;

import java.util.ArrayList;

public class Bear {
    private String name;
    private Belly bearBelly;

    public Bear(String name){
        this.name = name;
        this.bearBelly = new Belly();
    }

    public int foodCount(){
        return this.bearBelly.getBelly().size();
    }

    public void eat(Salmon fish){
        this.bearBelly.addFishToBelly(fish);
    }

    public void eatFishFromRiver(River river) {
        this.eat(river.removeFish());
    }
}
