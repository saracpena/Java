package com.sarapeña.wk1hw2;

import java.util.*;

public class EmptyHashSet {

    public static void main(String[] args) {
        //  Write a Java program to test a hash set is empty or not.

        //Creating HashSet Object
        HashSet<String> hashset = new HashSet<String>();

        //Add elements into the Set
        hashset.add("Hello");
        hashset.add("World");


        //Print the HashSet Values
        System.out.println("HashSet Elements: "+ hashset);

        //Check for the empty set
        System.out.println("Is the set empty: "+ hashset.isEmpty());

        //Clearing the set and Check for the empty set
        hashset.clear();
        System.out.println("Is the set empty: " + hashset.isEmpty());
    }

}
