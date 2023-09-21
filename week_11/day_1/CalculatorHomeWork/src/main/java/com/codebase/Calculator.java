package com.codebase;

public class Calculator {

    private static double Pi = 3.14;

    public static int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public static double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static int subtract(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    public static int multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public static double divide(double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }
}
