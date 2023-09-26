import org.example.classes.Barbarian;
import org.example.classes.Cleric;
import org.example.items.Herb;
import org.example.items.Potion;
import org.example.player.Player;
import org.example.weapons.Sword;
import org.example.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ClericTest {
    private Player fighter;
    private Cleric cleric;
    private Potion potion;
    private Weapon sword;
    private Herb herb;

    @Before
    public void before(){
        sword = new Sword(30);
        fighter = new Barbarian("Connan",100,sword);
        cleric = new Cleric("papas",80,20);
        potion = new Potion(15);
        herb = new Herb(10);
    }

    @Test
    public void clericCanHeal(){
        this.cleric.heal(fighter);
        assertEquals(120,fighter.getHealthPoints());
    }

    @Test
    public void potionCanHeal(){
        this.potion.heal(fighter);
        assertEquals(115,fighter.getHealthPoints());
    }

    @Test
    public void herbCanHeal(){
        this.herb.heal(fighter);
        assertEquals(110,fighter.getHealthPoints());
    }
}
