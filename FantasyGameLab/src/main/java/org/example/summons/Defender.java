package org.example.summons;

import org.example.IDefend;
import org.example.enemy.Enemy;

public class Defender implements IDefend {
        private int power;
        public Defender() {
            this.power = 20;
        }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void defend(Enemy enemy) {
            enemy.setHealthPoints(enemy.getHealthPoints() - this.getPower());

    }
}
