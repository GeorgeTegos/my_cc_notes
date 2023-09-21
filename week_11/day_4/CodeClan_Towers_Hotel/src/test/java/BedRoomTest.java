import org.example.BedRoom;
import org.example.Guest;
import org.example.Room;
import org.example.RoomType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    private Room room;
    private Guest george;

    @Before
    public void before(){
        george = new Guest("George");
        room = new BedRoom(14, RoomType.DoubleDouble);
    }

    @Test
    public void testRoomCapacity(){
        assertEquals(4,room.getCapacity());
    }

    @Test
    public void testGuestsInRoom(){
        room.addGuestToRoom(george);
        assertEquals(1,room.getGuestsInRoom().size());
    }

    @Test
    public void testBedroomsSide(){
        assertEquals(100.00, Room.roomSize(10.0,10.0),0.0);
    }


}
