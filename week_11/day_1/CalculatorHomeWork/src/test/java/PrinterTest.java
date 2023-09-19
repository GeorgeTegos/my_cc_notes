import org.junit.Test;
import org.junit.Before;
import com.codebase.Printer;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void testGetSheetsLeft(){
        assertEquals(100,printer.getNumberOfSheetsLeft());
    }

    @Test
    public void testPrint(){
        printer.print(2,5);
        assertEquals(90,printer.getNumberOfSheetsLeft());
    }


}
