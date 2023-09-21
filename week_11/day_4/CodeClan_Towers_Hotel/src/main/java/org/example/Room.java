package org.example;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestsInRoom;

    private RoomType roomType;
    public Room(RoomType roomType , int capacity){
        this.capacity = capacity;
        this.guestsInRoom = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }

    public void setGuestsInRoom(ArrayList<Guest> guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }

    public void addGuestToRoom(Guest guest){
        this.getGuestsInRoom().add(guest);
    }

    public void removeGuestFromRoom(Guest guest){
        this.getGuestsInRoom().remove(guest);
    }

    public static double roomSize(double length,double width){
    return length*width;
    }
}
