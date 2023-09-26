package org.example.weapons;

public class Axe extends Weapon{

    public Axe(int damage) {
        super(damage);
    }

    @Override
    public String attack() {
        return "I can attack for "+ this.getDamage() + " Damage!";
    }
}
