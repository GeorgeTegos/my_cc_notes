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
        this.sword.attack(enemy);
        assertEquals(70,enemy.getHealthPoints());

    }
    @Test
    public void AxeCanAttack(){
        this.axe.attack(enemy);
        assertEquals(60,enemy.getHealthPoints());
    }
    @Test
    public void ClubCanAttack(){
        this.club.attack(enemy);
        assertEquals(72,this.enemy.getHealthPoints());
    }
}
