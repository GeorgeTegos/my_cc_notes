import org.example.Book;
import org.example.Borrower;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower george;
    private Book bookOne;
    @Before
    public void before(){
        george= new Borrower("George");
        bookOne = new Book("Book Title","Book Author","Comedy");
    }

    @Test
    public void testBorrowerEmptyArray(){
        assertEquals(0,george.getBorrowerBooks().size());
    }

    @Test
    public void canAddBookToArray(){
        george.getABook(bookOne);
        assertEquals(1,george.getBorrowerBooks().size());
    }

    @Test
    public void canRemoveBookFromArray(){
        george.getABook(bookOne);
        george.removeBookFromArray(bookOne);
        assertEquals(0,george.getBorrowerBooks().size());
    }


}
