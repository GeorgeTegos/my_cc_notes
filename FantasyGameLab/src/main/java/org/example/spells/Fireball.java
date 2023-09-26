package org.example.spells;

public class Fireball extends Spell{
    public Fireball(int power) {
        super(power);
    }

    @Override
    public int cast() {
        return this.getPower();

    }
}
