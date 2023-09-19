import org.junit.Test;
import org.junit.Before;
import com.codebase.Bottle;
import static org.junit.Assert.assertEquals;
public class BottleTest {
    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100,bottle.getVolume());
    }

    @Test
    public void canDrink(){
        bottle.drink();
        assertEquals(90,bottle.getVolume());
    }

    @Test
    public void testEmpty(){
        bottle.empty();
        assertEquals(0,bottle.getVolume());
    }

    @Test
    public void testFill(){
        bottle.empty();
        bottle.fill();
        assertEquals(100,bottle.getVolume());
    }
}
