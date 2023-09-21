import org.example.BedRoom;
import org.example.Booking;
import org.example.RoomType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class BookingTest {

    private Booking booking;
    private BedRoom bedroom;


    @Before
    public void before(){
        bedroom= new BedRoom(10, RoomType.Double);
        this.booking = new Booking(bedroom ,5);
    }

    @Test
    public void haveABedroomBooked(){
        assertEquals(10,this.booking.getBedroom().getRoomNumber());
    }

    @Test
    public void testTotalBillOfBooking(){
        assertEquals(100,this.booking.getTotalBill());
    }


}
