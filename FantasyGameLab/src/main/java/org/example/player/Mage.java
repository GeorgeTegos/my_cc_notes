package org.example.player;

import org.example.IDefend;
import org.example.enemy.Enemy;
import org.example.spells.ISpell;
import org.example.spells.Spell;
import org.example.summons.Defender;

public abstract class Mage extends Player implements ISpell, IDefend {
    private Spell spell;

    public Mage(String name, int healthPoints, Spell spell) {
        super(name, healthPoints);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }


    public void cast(Enemy enemy) {
        enemy.setHealthPoints(enemy.getHealthPoints() - spell.getPower());
    }

    public void defend(Enemy enemy, Defender defender){
       defender.defend(enemy);
    }
}



