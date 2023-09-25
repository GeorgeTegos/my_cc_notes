package org.example;

public class Snake implements Swimmable{
    private String name;

    public Snake(String name){
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming.");
    }
}
