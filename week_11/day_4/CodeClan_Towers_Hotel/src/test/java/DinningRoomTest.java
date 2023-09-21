import org.example.*;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

    private Room room;
    private Guest george;

    @Before
    public void before(){
        george = new Guest("George");
        room = new DinningRoom("Dinning Room One",RoomType.DinningRoom);
    }

    @Test
    public void testRoomCapacity(){
        assertEquals(60,room.getCapacity());
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
        assertEquals("Dinning Room One",roomOne.getName());
    }

}
