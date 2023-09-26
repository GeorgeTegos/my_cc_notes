package org.example.spells;

public abstract class Spell implements ISpell {
    private int power;

    public Spell(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
