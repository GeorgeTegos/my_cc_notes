package org.example.weapons;

public class Sword extends Weapon{

    public Sword(int damage) {
        super(damage);
    }

    @Override
    public int attack() {
        return this.getDamage();
    }
}
