package com.sarapeña.wk1hw2;

import java.util.*;

public class HashSetToArray {

    public static void main(String[] args) {
        // Write a Java program to convert a hash set to an array.

        // Create a empty hash set
        HashSet<String> hashset = new HashSet<String>();

        // use add() method to add values in the hash set
        hashset.add("Blue");
        hashset.add("Green");
        hashset.add("Black");
        hashset.add("White");
        hashset.add("Pink");
        hashset.add("Yellow");

        System.out.println("Original Hash Set: " + hashset);

        // Creating an Array
        String[] new_array = new String[hashset.size()];
        hashset.toArray(new_array);

        // Displaying Array elements
        System.out.println("Array elements: ");
        for(String elements : new_array){
            System.out.println(elements);
        }
    }

}