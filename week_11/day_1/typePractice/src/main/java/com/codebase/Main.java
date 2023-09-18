package com.codebase;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'm excited to learn java");

        int age = 24;
        long numberOfPeopleAlive = 8_123_321_123L;
        double balance = 103.43;
        float newBalance = 103.43F;
        char firstInitial = 'G';
        boolean isRaining = true;


        String name = "George";
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        double myAge = age;
        long myLong = age;

        long newPopulation = 9000000;
        System.out.println(newPopulation);

        int myBalance = (int) balance;
        System.out.println(myBalance);

        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();

        System.out.println(myName);

        System.out.println("What's your age?");
        Integer ageInput = scanner.nextInt();
        System.out.println(ageInput);

        if(ageInput >= 25){
            System.out.println("25 or more");
        } else {
            System.out.println("Lower than 25");
        }

        // Task booking system
        // Input: Name , number of people , phone
        // Final output: "You have booked a table for <name>, <number of people>, <phone>"
            // Boolean , isTableAvailable , if statement if available


    }
}