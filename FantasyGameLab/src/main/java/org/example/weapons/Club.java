package org.example.weapons;

public class Club extends Weapon{

    public Club(int damage) {
        super(damage);
    }

    @Override
    public int attack() {
        return this.getDamage();
    }
}
