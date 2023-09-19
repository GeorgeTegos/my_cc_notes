import org.junit.Test;
import org.junit.Before;
import com.codebase.Calculator;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(10,calculator.add(5,5));
    }

    @Test
    public void testSubtract(){
        assertEquals(0,calculator.subtract(5,5));
    }

    @Test
    public void testMultiply(){
        assertEquals(10,calculator.multiply(2,5));
    }

    @Test
    public void testDivide(){
        assertEquals(4,calculator.divide(12,3), 0.0);
    }

}
