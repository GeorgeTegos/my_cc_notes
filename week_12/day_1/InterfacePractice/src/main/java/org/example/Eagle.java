package org.example;

public class Eagle implements Flyable{
    private String name;

    public Eagle(String name){
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}
