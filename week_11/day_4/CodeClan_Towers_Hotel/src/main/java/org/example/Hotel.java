package org.example;

import com.sun.jndi.ldap.Ber;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Hotel {
    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String,DinningRoom> dinningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.dinningRooms = new HashMap<>();
    }

    public ArrayList<BedRoom> getBedRooms(){
        return this.bedrooms;
    }

    public HashMap<String, DinningRoom> getDinningRooms() {
        return dinningRooms;
    }

    public ArrayList getConferenceRooms(){
        return this.conferenceRooms;
    }

    public void setBedrooms(ArrayList<BedRoom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void checkIn(Room room, Guest guest){
        ArrayList<BedRoom> emptyRooms = new ArrayList<>();
        emptyRooms = emptyBedRooms();
        if(room.getGuestsInRoom().size()==0) {
            room.addGuestToRoom(guest);
        }
    }

    public void checkOut(Room room){
        room.getGuestsInRoom().clear();
    }

    public Booking bookRoom(BedRoom bedroom ,int amountOfNights){
        Booking booking ;
        booking = new Booking(bedroom,amountOfNights);
        return booking;
    }

    public ArrayList<BedRoom> emptyBedRooms(){
        ArrayList<BedRoom> result;
        result = new ArrayList<>();

        for(BedRoom bedRoom: this.getBedRooms()){
            if(bedRoom.getGuestsInRoom().isEmpty()){
                result.add(bedRoom);
            }
        }


        return result;
    }
}

