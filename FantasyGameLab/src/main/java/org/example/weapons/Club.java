package org.example.weapons;

public class Club extends Weapon{

    public Club(int damage) {
        super(damage);
    }

    @Override
    public String attack() {
        return "I can attack for "+ this.getDamage() + " Damage!";
    }
}
