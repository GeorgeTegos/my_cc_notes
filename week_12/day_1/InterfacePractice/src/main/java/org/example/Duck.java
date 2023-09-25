package org.example;

public class Duck extends Animal implements Flyable, Swimmable {

    public Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly.");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim.");
    }


}
