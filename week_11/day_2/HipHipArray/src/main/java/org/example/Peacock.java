package org.example;

public class Peacock {
    private String[] colours;

    public Peacock(){
        this.colours =new String[] { "Brown", "Green", "Yellow","Blue"};
    }

    public String[] getColours() {
        return this.colours;
    }

    public String getColourFromIndex(int index){

        return this.getColours()[index];
    }

    public void changeColour(String colour, int index){
        this.getColours()[index] = colour;
    }
}
