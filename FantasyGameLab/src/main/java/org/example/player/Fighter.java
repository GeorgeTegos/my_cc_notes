package org.example.player;

import org.example.enemy.Enemy;
import org.example.weapons.Axe;
import org.example.weapons.IWeapons;
import org.example.weapons.Weapon;

public abstract class Fighter extends Player implements IWeapons {
    private Weapon weapon;
    public Fighter(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void attack(Enemy enemy) {
       enemy.setHealthPoints(enemy.getHealthPoints() - this.weapon.getDamage());
    }

    public void swapWeapon(Weapon weapon) {
        this.setWeapon(weapon);
    }
}
