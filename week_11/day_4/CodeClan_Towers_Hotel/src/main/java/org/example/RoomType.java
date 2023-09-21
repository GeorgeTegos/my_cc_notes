package org.example;

public enum RoomType {
    Single(1),
    Double(2),
    DoubleDouble(4),
    Conference(40),
    DinningRoom(60);

    private final int capacity;
    RoomType(int capacity){
        this.capacity=capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
