package com.codebase;

public class Runner {
    public static void main(String[] args) {

        Plannet mars = new Plannet("Mars",908973);

        System.out.println(mars.getName()+ " is " + mars.getSize());
        System.out.println(mars.explode());


    }
}
