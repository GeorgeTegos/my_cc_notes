package com.codebase;

public class Calculator {
    private int intOne;
    private int intTwo;

    public int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }

    public int subtract(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    public int multiply(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }

    public double divide(double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }
}