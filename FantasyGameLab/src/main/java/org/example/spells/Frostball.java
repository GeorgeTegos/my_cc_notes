package org.example.spells;

public class Frostball extends Spell{
    public Frostball(int power) {
        super(power);
    }

    @Override
    public int cast() {
        return this.getPower();

    }
}
