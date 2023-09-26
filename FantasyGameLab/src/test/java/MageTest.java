import org.example.classes.Wizard;
import org.example.enemy.Enemy;
import org.example.enemy.Orc;
import org.example.player.Mage;
import org.example.spells.Frostball;
import org.example.spells.Spell;
import org.example.summons.Defender;
import org.example.summons.Dragon;
import org.example.summons.Ogre;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MageTest {
    private Mage mage;
    private Spell spell;
    private Defender defender;
    private Defender defenderTwo;
    private Enemy enemy;
    @Before
    public void before(){
        spell = new Frostball(25);
        enemy = new Orc(100);
        defenderTwo = new Ogre();
        defender = new Dragon();
        mage = new Wizard("Harry",100,spell);
    }

    @Test
    public void mageCanDefendDragon(){
        this.mage.defend(enemy,defender);
        assertEquals(50,this.enemy.getHealthPoints());
    }
    @Test
    public void mageCanDefendOgre(){
        this.mage.defend(enemy,defenderTwo);
        assertEquals(80,this.enemy.getHealthPoints());
    }

}
