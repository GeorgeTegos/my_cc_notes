import org.example.classes.Wizard;
import org.example.enemy.Enemy;
import org.example.enemy.Orc;
import org.example.player.Mage;
import org.example.player.Player;
import org.example.spells.Fireball;
import org.example.spells.Spell;
import org.example.summons.Defender;
import org.example.summons.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    private Spell spell;
    private Enemy enemy;
    private Mage mage;
    private Defender defender;


    @Before
    public void before(){

        spell = new Fireball(30);
        defender = new Dragon();
        mage = new Mage("Harry", 100,spell);
        enemy = new Orc(100);
    }

    @Test
    public void mageCastSpell(){
        int newEnemyHP = enemy.getHealthPoints() - this.mage.getSpell().cast();
        enemy.setHealthPoints(newEnemyHP);
        assertEquals(70,enemy.getHealthPoints());
    }

    @Test
    public void defenderCanDefend(){
        int newEnemyHp = enemy.getHealthPoints() - this.mage.defend(defender);
        enemy.setHealthPoints(newEnemyHp);
        assertEquals(65,enemy.getHealthPoints());



    }



}
