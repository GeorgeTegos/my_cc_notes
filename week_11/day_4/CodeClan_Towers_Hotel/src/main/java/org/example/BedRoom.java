package org.example;

import java.util.ArrayList;

public class BedRoom extends Room{

    private int roomNumber;
    private final int nightRate;
    public BedRoom(int roomNumber, RoomType roomType) {
        super(roomType,roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.nightRate = 20;

    }

    public int getNightRate() {
        return nightRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
