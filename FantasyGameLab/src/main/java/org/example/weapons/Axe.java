package org.example.weapons;

public class Axe extends Weapon{

    public Axe(int damage) {
        super(damage);
    }

    @Override
    public int attack() {
        return this.getDamage();
    }
}
