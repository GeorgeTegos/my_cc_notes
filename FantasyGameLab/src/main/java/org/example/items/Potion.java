package org.example.items;

import org.example.IHeal;
import org.example.player.Player;

public class Potion implements IHeal {

    private int amount;

    public Potion(int amount){
        this.amount=amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void heal(Player player) {
        player.setHealthPoints(player.getHealthPoints() + this.getAmount());
    }
}
