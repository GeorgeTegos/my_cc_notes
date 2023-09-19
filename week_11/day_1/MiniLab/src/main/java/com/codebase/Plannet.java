package com.codebase;

public class Plannet {
    private String name;
    private double size;

    public Plannet(String name, double size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String explode(){
        return String.format("Boom!, %s has exploded!", this.name);
    }
}
