package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static int doubleNumber(int num){
        return num*2;
    }
    public static void main(String[] args) {

        List<String> listOfNames = Arrays.asList("amanda", "bob","charlie","dave");
        listOfNames.stream().map(String::toUpperCase).forEach(name -> System.out.println(name));

        List<String> upperNames = listOfNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames);

        List<Integer> numbersTimesTwo = Stream.of(1,2,3,4,5)
//                .map(num-> num*2)
                .map(Main::doubleNumber)
                .collect(Collectors.toList());

        System.out.println(numbersTimesTwo);
    }
}
// Intermediate operations
//.map
//.filter

//Terminal operations
//.forEach()
//.max() / .min()
//.counter()
//.collect()