package org.example;

public class Sheep extends FarmAnimal{

    public Sheep(String species) {
        super(species);
    }

    public String makeANoise(){
        return "baa";
    }

    public String introduceYourself(){
        return "Hi, I am a sheep, baa baa";
    }
}
