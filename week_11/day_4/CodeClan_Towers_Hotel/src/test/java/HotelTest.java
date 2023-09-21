import org.example.*;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private BedRoom bedroom;
    private BedRoom bedroomTwo;
    private BedRoom bedroomThree;
    private Guest george;
    private Guest tina;
    private DinningRoom dinningRoom;
    @Before
    public void before(){
        bedroom = new BedRoom(10, RoomType.Double);
        bedroomTwo = new BedRoom(20, RoomType.Double);
        bedroomThree = new BedRoom(30, RoomType.Double);
        dinningRoom = new DinningRoom("Main Dinner",RoomType.DinningRoom);
        george = new Guest("George");
        tina = new Guest("Tina");
        hotel = new Hotel();
    }

    @Test
    public void hasEmptyBedroomsList(){
        assertEquals(0,this.hotel.getBedRooms().size());
    }

    @Test
    public void hasEmptyConferenceRooms(){
        assertEquals(0,this.hotel.getConferenceRooms().size());
    }

    @Test
    public void haveARoom(){
        this.hotel.getBedRooms().add(bedroom);
        assertEquals(1,this.hotel.getBedRooms().size());
    }

    @Test
    public void canCheckIn(){
        this.hotel.checkIn(bedroom, george);
        assertEquals(1,this.bedroom.getGuestsInRoom().size());
    }


    @Test
    public void canCheckOut(){
        this.hotel.checkIn(bedroom, george);
        this.hotel.checkIn(bedroom, tina);
        this.hotel.checkOut(bedroom);
        assertEquals(0,this.bedroom.getGuestsInRoom().size());
    }

    @Test
    public void canBookRoom(){
        Booking newBooking;
        newBooking = this.hotel.bookRoom(bedroom,5);
        assertEquals(5,newBooking.getNumberOfNights());
    }

    @Test
    public void hasDinningRoomHashMap(){
        this.hotel.getDinningRooms().put(dinningRoom.getName(),dinningRoom);
        assertEquals(1,this.hotel.getDinningRooms().size());
    }

    @Test
    public void canReturnOnlyFreeBedRooms(){
        this.hotel.getBedRooms().add(bedroom);
        this.hotel.getBedRooms().add(bedroomTwo);
        this.hotel.getBedRooms().add(bedroomThree);

        this.hotel.checkIn(bedroom, george);
        this.hotel.checkIn(bedroomTwo, tina);

        assertEquals(1,this.hotel.emptyBedRooms().size());

    }

}
