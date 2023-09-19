import org.example.Library;
import org.example.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library publicLibrary;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;


    @Before
    public void before(){
        publicLibrary = new Library("Public Library",5);

        bookOne = new Book("Book Title One","Book Author One","Comedy");
        bookTwo = new Book("Book Title Two","Book Author Two","Comedy");
        bookThree = new Book("Book Title Three","Book Author Three","Horror");
    }

    @Test
    public void testNumberOfBooksInLibrary(){
        assertEquals(0,publicLibrary.countTheBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        publicLibrary.addBook(bookThree);
        assertEquals(1,publicLibrary.countTheBooks());
    }

    @Test
    public void hasBookCapacity(){
        assertEquals(5,publicLibrary.getLibraryCapacity());
    }

    @Test
    public void hasEnoughCapacityToAddABook(){
        assertEquals(true,publicLibrary.enoughCapacityToAddABook());
    }

    @Test
    public void canFindAmountOfBooksByGenre(){
        this.publicLibrary.addBook(bookOne);
        this.publicLibrary.addBook(bookTwo);
        this.publicLibrary.addBook(bookThree);
        assertEquals(2,publicLibrary.findAmountOfBooksByGenre("Comedy"));
    }

    @Test
    public void testCreateHashMap(){
        this.publicLibrary.addBook(bookOne);
        this.publicLibrary.addBook(bookTwo);
        this.publicLibrary.addBook(bookThree);

        HashMap <String, Integer> expecting ;
        expecting = new HashMap<>();
        expecting.put("Comedy",2);
        expecting.put("Horror",1);

        this.publicLibrary.createHashMap();
        assertEquals(expecting,publicLibrary.getAmountOfBooksByGenre());

    }
}
