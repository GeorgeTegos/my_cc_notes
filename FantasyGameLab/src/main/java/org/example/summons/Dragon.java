package org.example.summons;

import org.example.IDefend;
import org.example.enemy.Enemy;

public class Dragon extends Defender implements IDefend {

    private int power;
    public Dragon() {
        this.power = 50;
    }
    public int getPower(){
        return this.power;
    }


    @Override
    public void defend(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - this.getPower());
    }
}
