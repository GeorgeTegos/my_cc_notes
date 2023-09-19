package com.codebase;

public class Printer {
    private int numberOfSheetsLeft;
    private int toner;

    public Printer(int amount, int toner){
        this.numberOfSheetsLeft = amount;
        this.toner= toner;
    }

    public int getToner() {
        return toner;
    }

    private void setToner(int toner) {
        this.toner = toner;
    }

    public int getNumberOfSheetsLeft(){
        return this.numberOfSheetsLeft;
    }
    private void setNumberOfSheetsLeft(int numberOfSheetsLeft) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
    }

    public void print(int numberOfPages, int amountOfCopies){
        int totalPages = numberOfPages * amountOfCopies;
        if (this.getNumberOfSheetsLeft() >= totalPages
        && this.getToner()>= totalPages){
        this.setNumberOfSheetsLeft(this.getNumberOfSheetsLeft() - totalPages);
        this.setToner(this.getToner()-totalPages);
        }

    }
}
