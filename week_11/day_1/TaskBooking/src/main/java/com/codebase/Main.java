package com.codebase;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name?");
        String nameForBooking = scanner.nextLine();

        System.out.println("Number of People");
        int numberOfPeopleForBooking = scanner.nextInt();

        System.out.println("Phone Number");
        long phoneForBooking = scanner.nextLong();

        Booking bookingOne = new Booking(nameForBooking,numberOfPeopleForBooking,phoneForBooking);

        System.out.println(bookingOne.BookingInfo());

        bookingOne.ChangeBookingStatus();

        System.out.println(bookingOne.BookingInfo());

    }
}