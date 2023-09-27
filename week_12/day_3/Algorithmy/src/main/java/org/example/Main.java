package org.example;

import org.example.Node;

import java.util.LinkedList;


public class Main {

    static int linearSearch(int[] nums, int numberToFind) {
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If the target is found at the middle, return its index
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If the target is not found in the array, return -1
        return -1;


    }

    public static void main(String[] args) {
        double start = System.nanoTime();
        int[] numbers = new int[100_000_000]; // Create an array to hold 1,000,000 numbers

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Populate the array with numbers from 1 to 1,000,000
        }
        int target = 99_000_000;

        int result = binarySearch(numbers, target);

        double end = (System.nanoTime() - start) / 1_000_000_000;

        System.out.println("Algorithm took " + end);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }


    }
}


//    }
//        System.out.println("Hello world!");
//        Node head = new Node(7);
//        Node node2 = new Node (5);
//        Node node3 = new Node(3);
//
//        head.next = node2;
//        node2.next = node3;
//
//        Node current = head;
//
//        while (current!=null){
//            System.out.println(current.val);
//            current.prev = current;
//            current = current.next;
//        }
//    }
//            }