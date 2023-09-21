import com.codebase.Calculator;
import org.junit.Test;
import org.junit.Before;
import static com.codebase.Calculator.add;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd(){
        assertEquals(10, add(5,5));
    }

    @Test
    public void testSubtract(){
        assertEquals(0,Calculator.subtract(5,5));
    }

    @Test
    public void testMultiply(){
        assertEquals(10,Calculator.multiply(2,5));
    }

    @Test
    public void testDivide(){
        assertEquals(4,Calculator.divide(12,3), 0.0);
    }

}
