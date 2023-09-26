package org.example.weapons;

public abstract class Weapon implements IWeapons {
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
