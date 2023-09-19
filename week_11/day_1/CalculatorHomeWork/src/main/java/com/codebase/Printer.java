package com.codebase;

public class Printer {
    private int numberOfSheetsLeft;

    public Printer(int amount){
        this.numberOfSheetsLeft = amount;
    }

    public int getNumberOfSheetsLeft(){
        return this.numberOfSheetsLeft;
    }
    private void setNumberOfSheetsLeft(int numberOfSheetsLeft) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
    }

    public void print(int numberOfPages, int amountOfCopies){
        if (this.getNumberOfSheetsLeft() >= numberOfPages*amountOfCopies){
        this.setNumberOfSheetsLeft(this.getNumberOfSheetsLeft() - numberOfPages*amountOfCopies);}

    }
}
