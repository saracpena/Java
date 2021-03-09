package com.sarapeña.wk1hw2;

import java.util.*;

public class HashElements {

    public static void main(String[] args) {
        // Write a Java program to get the number of elements in a hash set

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
        System.out.println("Size of the Hash Set: " + hashset.size());

    }

}
