import org.example.Horse;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HorseTest {
    private Horse horse;

    @Before
    public void before(){
        horse = new Horse("horse","pony");
    }

    @Test
    public void hasBreed(){
        assertEquals("pony",this.horse.getBreed());
    }
    @Test
    public void hasSpecies(){
        assertEquals("horse",this.horse.getSpecies());
    }

    @Test
    public void canMakeANoise(){
        assertEquals("neigh",this.horse.makeANoise());
    }

    @Test
    public void canIntroduceYourself(){
        String expect = "Hi, I am a horse from pony family, neigh neigh";
        assertEquals(expect,this.horse.introduceYourself());
    }
}
