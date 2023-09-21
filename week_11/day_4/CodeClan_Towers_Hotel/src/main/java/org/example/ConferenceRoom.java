package org.example;

public class ConferenceRoom extends Room{

    private String name;
    public ConferenceRoom(String name,RoomType roomType){
        super(roomType,roomType.getCapacity());
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
