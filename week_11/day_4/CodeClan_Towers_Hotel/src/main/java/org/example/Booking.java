package org.example;

public class Booking {
    private BedRoom bedroom;
    private int numberOfNights;

    public Booking(BedRoom bedroom,int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public BedRoom getBedroom() {
        return bedroom;
    }

    public void setBedroom(BedRoom bedroom) {
        this.bedroom = bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getTotalBill(){
        return this.getNumberOfNights() * this.getBedroom().getNightRate();
    }
}
