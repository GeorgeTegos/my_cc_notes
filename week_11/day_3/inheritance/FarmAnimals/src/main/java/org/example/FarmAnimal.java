package org.example;

public abstract class FarmAnimal {
    private String species;

    public FarmAnimal(String species){
        this.species = species;
    }

    public String getSpecies(){
        return this.species;
    }

    public String introduceYourself(){
        return "Hi, I am a cow!";
    }

    public abstract String makeANoise();
}
