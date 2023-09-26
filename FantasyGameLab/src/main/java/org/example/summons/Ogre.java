package org.example.summons;

import org.example.IDefend;
import org.example.enemy.Enemy;

public class Ogre extends Defender implements IDefend {
        private int power;
        public Ogre(){
            this.power = 20;
        }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void defend(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - this.getPower());
    }
}
