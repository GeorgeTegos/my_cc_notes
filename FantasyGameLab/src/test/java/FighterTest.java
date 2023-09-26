import org.example.classes.Barbarian;
import org.example.player.Fighter;
import org.example.weapons.Axe;
import org.example.weapons.Sword;
import org.example.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FighterTest {
    private Fighter fighter;
    private Weapon weapon ;

    @Before
    public void before(){
        weapon = new Sword(30);
        fighter = new Barbarian("Connan",200, weapon);
    }

    @Test
    public void fighterHasWeapon(){
        assertEquals( weapon ,this.fighter.getWeapon());
    }

    @Test
    public void fighterCanSwapWeapon(){
        Axe axe = new Axe(40);
        this.fighter.swapWeapon(axe);
        assertEquals(axe,this.fighter.getWeapon());
    }
}
