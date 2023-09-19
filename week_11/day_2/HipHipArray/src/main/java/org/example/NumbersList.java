package org.example;

import java.util.ArrayList;

public class NumbersList {
    private ArrayList<Integer> numbers;

    public NumbersList(){
        this.numbers =new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }

    public int getSize() {
        return this.getNumbers().size();
    }

    public void addNumber(int _number) {
        this.getNumbers().add(_number);
    }

    public int getNumberAtIndex(int index) {
        return this.getNumbers().get(index);
    }

    public void multiplyNumberByTwo(){
        for(int i=0; i < this.getSize(); i++){
            this.getNumbers().set(i,this.getNumberAtIndex(i)*2);
        }
    }

}
