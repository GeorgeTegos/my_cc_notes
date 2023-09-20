import org.example.Sheep;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SheepTest {

    private Sheep sheep;

    @Before
    public void before(){
        sheep = new Sheep("Sheep");
    }

    @Test
    public void hasSpecies(){
        assertEquals("Sheep", this.sheep.getSpecies());
    }
    @Test
    public void canMakeANoise(){
        assertEquals("baa", this.sheep.makeANoise());
    }

    @Test
    public void testIntroduceYourself(){
        String expect = "Hi, I am a sheep, baa baa";
        assertEquals(expect,this.sheep.introduceYourself());
    }
}
