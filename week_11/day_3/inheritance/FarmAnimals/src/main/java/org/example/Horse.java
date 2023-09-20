package org.example;

public class Horse extends FarmAnimal{

    private String breed;
    public Horse(String species, String breed){
        super(species);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public String makeANoise(){
        return "neigh";
    }

    public String introduceYourself(){
        return "Hi, I am a "+this.getSpecies()+
                " from "+this.getBreed()+
                " family, "+this.makeANoise()+
                " "+this.makeANoise()+"";
    }
}
