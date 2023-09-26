package org.example.classes;

import org.example.IHeal;
import org.example.player.Player;

public class Cleric extends Player implements IHeal {
    private int healingPower;
    public Cleric(String name, int healthPoints, int healingPower) {
        super(name, healthPoints);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public void heal(Player player) {
        player.setHealthPoints(player.getHealthPoints() + this.getHealingPower());
    }
}
