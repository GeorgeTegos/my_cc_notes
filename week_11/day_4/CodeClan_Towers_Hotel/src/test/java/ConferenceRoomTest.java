import org.example.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private Room room;
    private Guest george;

    @Before
    public void before(){
        george = new Guest("George");
        room = new ConferenceRoom("Events Room One",RoomType.Conference);
    }

    @Test
    public void testRoomCapacity(){
        assertEquals(40,room.getCapacity());
    }

    @Test
    public void testGuestsInRoom(){
        room.addGuestToRoom(george);
        assertEquals(1,room.getGuestsInRoom().size());
    }

    @Test
    public void hasName(){
        ConferenceRoom roomOne ;
        roomOne =(ConferenceRoom) room;
        assertEquals("Events Room One",roomOne.getName());
    }

    @Test
    public void testConferenceRoom(){
        assertEquals(100, Room.roomSize(10,10),0.0);
    }

}
