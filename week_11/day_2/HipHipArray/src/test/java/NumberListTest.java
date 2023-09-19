import org.example.NumbersList;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class NumberListTest {
    private NumbersList myNumbers;

    @Before
    public void before(){
        this.myNumbers= new NumbersList();
    }

    @Test
    public void hasNoNumbers(){
        assertEquals(0,this.myNumbers.getSize());
    }

    @Test
    public void canAddNumber(){
        this.myNumbers.addNumber(7);
        assertEquals(1,this.myNumbers.getSize());
    }

    @Test
    public void canFindAtIndex(){
        this.myNumbers.addNumber(15);
        this.myNumbers.addNumber(13);
        assertEquals(15,this.myNumbers.getNumberAtIndex(0));
    }

}
