package org.example.spells;

import org.example.enemy.Enemy;

public class LightingStrike extends Spell{

    public LightingStrike(int power) {
        super(power);
    }

    @Override
    public void cast(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - this.getPower());

    }
}
