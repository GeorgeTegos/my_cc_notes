package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numberLoop = new ArrayList<>();

        numberLoop.add(5);
        numberLoop.add(3);
        numberLoop.add(6);

        for(int i =0; i<numberLoop.size();i++){
            System.out.println(numberLoop.get(i)*2);
            numberLoop.set(i, numberLoop.get(i) * 2);
        }

//        for(type name: ArrayName){
//
//        }

        for(int number: numberLoop){
            System.out.println(number);
        }
    }
}