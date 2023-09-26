package org.example.weapons;

import org.example.enemy.Enemy;

public class Sword extends Weapon{

    public Sword(int damage) {
        super(damage);
    }


    public void attack(Enemy enemy) {
      enemy.setHealthPoints(enemy.getHealthPoints()-this.getDamage());
    }
}
