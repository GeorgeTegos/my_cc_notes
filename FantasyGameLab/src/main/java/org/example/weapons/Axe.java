package org.example.weapons;

import org.example.enemy.Enemy;

public class Axe extends Weapon{

    public Axe(int damage) {
        super(damage);
    }



    public void attack(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - this.getDamage());
    }
}
