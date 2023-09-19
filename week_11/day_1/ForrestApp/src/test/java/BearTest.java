import com.codebase.Bear;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class BearTest {
    Bear bear;
    @Before
    public void before(){
        bear = new Bear("Baloo",20,401.23);
    }
    @Test
    public void hasName(){
        assertEquals("Baloo",bear.getName());
    }
    @Test
    public void hasAge(){
        assertEquals(20,bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(401.23,bear.getWeight(), 0.0);
    }

    @Test
    public void canSetWeight(){
        bear.setWeight(300);
        assertEquals(300,bear.getWeight(), 0.0);
    }

    @Test
    public void canEatPeocock(){
        bear.eatPeacock(4);
        assertEquals(405.23,bear.getWeight(),0.0);
    }
}
