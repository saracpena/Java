package com.sarapeña.wk1hw2;

import java.util.*;

public class TwoSets {

    public static void main(String[] args) {
        // Write a Java program to compare two sets and retain elements which are same on both sets.

        // Create a empty hash set
        HashSet<String> hashset = new HashSet<String>();

        // use add() method to add values in the hash set
        hashset.add("Blue");
        hashset.add("Green");
        hashset.add("Black");
        hashset.add("White");

        System.out.println("First HashSet content: " + hashset);

        // Create a empty hash set
        HashSet<String>hashset2 = new HashSet<String>();

        // use add() method to add values in the hash set
        hashset2.add("Red");
        hashset2.add("Pink");
        hashset2.add("Black");
        hashset2.add("Yellow");

        System.out.println("Second HashSet content: "+ hashset2);

        hashset.retainAll(hashset2);
        System.out.println("Similar element in both hashset: ");
        System.out.println(hashset);
    }

}
