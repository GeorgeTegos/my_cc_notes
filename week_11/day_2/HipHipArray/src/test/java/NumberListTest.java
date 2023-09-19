import org.example.NumbersList;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.*;

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

    @Test
    public void canMultiplyArrayByTwo(){
        this.myNumbers.addNumber(1);
        this.myNumbers.addNumber(2);
        this.myNumbers.addNumber(3);
        this.myNumbers.addNumber(4);

        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(2);
        testNumbers.add(4);
        testNumbers.add(6);
        testNumbers.add(8);

        this.myNumbers.multiplyNumberByTwo();

        assertEquals(testNumbers, this.myNumbers.getNumbers());



    }

}
