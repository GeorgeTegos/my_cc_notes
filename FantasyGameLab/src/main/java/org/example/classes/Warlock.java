package org.example.classes;

import org.example.enemy.Enemy;
import org.example.player.Mage;
import org.example.spells.Spell;

public class Warlock extends Mage {

    public Warlock(String name, int healthPoints, Spell spell) {
        super(name, healthPoints, spell);
    }



    public void defend(Enemy enemy) {

    }
}
