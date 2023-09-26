import org.example.weapons.Axe;
import org.example.weapons.Club;
import org.example.weapons.Sword;
import org.example.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WeaponTest {
    private Sword sword;
    private Axe axe;
    private Club club;

    @Before
    public void before(){
        sword = new Sword(30);
        club = new Club(28);
        axe = new Axe(40);
    }

    @Test
    public void swordCanAttack(){
        String expect = "I can attack for 30 Damage!";
        assertEquals(expect,this.sword.attack());
    }
    @Test
    public void AxeCanAttack(){
        String expect = "I can attack for 40 Damage!";
        assertEquals(expect,this.axe.attack());
    }
    @Test
    public void ClubCanAttack(){
        String expect = "I can attack for 28 Damage!";
        assertEquals(expect,this.club.attack());
    }
}
