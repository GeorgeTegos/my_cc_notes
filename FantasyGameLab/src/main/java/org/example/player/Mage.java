package org.example.player;

import org.example.IDefend;
import org.example.spells.ISpell;
import org.example.spells.Spell;
import org.example.summons.Defender;

public class Mage extends Player implements IDefend, ISpell {
    private Spell spell;
    private Defender defender;

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

    @Override
    public int cast() {
        return 0;
    }

    @Override
    public int defend(Defender defender) {
        return defender.getPower();
    }


}
