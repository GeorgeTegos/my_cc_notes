package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits;
        favouriteFruits = new HashMap<>();

        favouriteFruits.put("Jason", "Banana");
        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Jerry", "Orange");
        favouriteFruits.put("Sarah", "Strawberry");

        System.out.println(favouriteFruits.get("Alice"));
        System.out.println(favouriteFruits.containsKey("Jason"));
        System.out.println(favouriteFruits.containsValue("Melon"));

        favouriteFruits.remove("Sarah");
        System.out.println(favouriteFruits);

        favouriteFruits.clear();
        System.out.println(favouriteFruits);

        // .put(key,value) = add k,v pair to hashmap
        // .get(key) = Return the value associated with the key
        // .contains(key/value) = Returns True/False if K/V is present
        // .remove(key) = Removes key and it's value from the Hashmap
        // .clear() = removes everything from the hashmap

    }
}