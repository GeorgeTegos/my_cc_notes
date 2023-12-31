package com.codebase;

import java.text.MessageFormat;

public class Booking {
    private String name;
    private int numberOfPeople;
    private long phone;
    private boolean confirmed;
    public Booking(String name,int numberOfPeople, long phone) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.phone = phone;
        this.confirmed = false;
    }
    
    public String BookingInfo(){
        String bookingStatus;
        if(this.confirmed){
            bookingStatus = "Booking Confirmed";
        } else {
             bookingStatus = "Booking Not Confirmed Yet";
        }
        return String.format("__________" +
                "\nBooking for %s " +
                "\nFor %d people." +
                "\nPhone: %d " +
                "\n%s" +
                "\n____________",this.name,this.numberOfPeople,this.phone,bookingStatus);
    }

    public void ChangeBookingStatus(){
        this.confirmed = !this.confirmed;
    }

}
