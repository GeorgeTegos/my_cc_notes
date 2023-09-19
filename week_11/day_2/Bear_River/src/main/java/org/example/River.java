package org.example;

import java.util.ArrayList;

public class River {
    private ArrayList<Salmon> fishesInsideRiver;

    public River(){
        this.fishesInsideRiver = new ArrayList<>();
    }
    public void add(Salmon salmon) {
        this.fishesInsideRiver.add(salmon);
    }

    public ArrayList<Salmon> getFishesInsideRiver() {
        return this.fishesInsideRiver;
    }

    public int getFishCount() {
         return this.fishesInsideRiver.size();
    }

    public Salmon removeFish() {
       return this.getFishesInsideRiver().remove(this.getFishesInsideRiver().size()-1);
    }
}
