import org.example.Peacock;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class ArrayTest {
    Peacock peacock;
    @Before
    public void before(){
        peacock = new Peacock();
    }
    @Test
    public void hasFourColours(){
        assertEquals(4,peacock.getColours().length);
    }

    @Test
    public void hasBlueColourAtIndexThree(){
        assertEquals("Blue", peacock.getColourFromIndex(3));
    }

    @Test
    public void changeColour(){
        peacock.changeColour("Red", 0);
        assertEquals("Red", peacock.getColours()[0]);
    }
}
