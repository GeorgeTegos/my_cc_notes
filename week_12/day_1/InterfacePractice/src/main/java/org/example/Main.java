package org.example;

public class Main {
    public static void main(String[] args) {

        Duck duckOne = new Duck("Donald");
        Snake snakeOne = new Snake("Kaa");
        Eagle eagleOne = new Eagle("Sam");

        Flyable[] flyingAnimals = new Flyable[2];
        flyingAnimals[0] = duckOne;
        flyingAnimals[1] = eagleOne;

        for(Flyable animal: flyingAnimals){
            animal.fly();
        }
//        duckOne.fly();
//        eagleOne.fly();
//        snakeOne.swim();
    }
}

//Abstract Class:
//- Constructor
//- can implement methods
//-single inheritance
//-can have state(Variable)
// Is-A relationship (Duck IS animal)

//Interface:
//-cannot have constructor
//-cannot implement
//-multiple interfaces
// HAS-A Relationship (Duc