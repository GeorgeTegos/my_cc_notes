import org.example.enemy.Enemy;
import org.example.enemy.Orc;
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
    private Enemy enemy;

    @Before
    public void before(){
        enemy = new Orc(100);
        sword = new Sword(30);
        club = new Club(28);
        axe = new Axe(40);
    }

    @Test
    public void swordCanAttack(){
        assertEquals(30,this.sword.attack());
        int afterCombat = enemy.getHealthPoints()-this.sword.attack();
        assertEquals(70,afterCombat);
    }
    @Test
    public void AxeCanAttack(){
        assertEquals(40,this.axe.attack());
        int afterCombat = enemy.getHealthPoints()-this.axe.attack();
        assertEquals(60,afterCombat);
    }
    @Test
    public void ClubCanAttack(){
        assertEquals(28,this.club.attack());
        int afterCombat = enemy.getHealthPoints()-this.club.attack();
        assertEquals(72,afterCombat);
    }
}
