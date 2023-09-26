package org.example.spells;

public class LightingStrike extends Spell{

    public LightingStrike(int power) {
        super(power);
    }

    @Override
    public int cast() {
        return this.getPower();

    }
}
