import org.example.Bear;
import org.example.Belly;
import org.example.River;
import org.example.Salmon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;
    private Salmon salmon;
    private River river; //ADDED
    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon();
        river = new River();    // ADDED
        river.add(salmon);  // ADDED
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFishFromRiver(river); //AMENDED
        assertEquals(0, river.getFishCount());
    }
}