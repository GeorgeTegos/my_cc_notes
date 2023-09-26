package org.example.weapons;

public class Sword extends Weapon{

    public Sword(int damage) {
        super(damage);
    }

    @Override
    public String attack() {
        return "I can attack for "+ this.getDamage() + " Damage!";
    }
}
