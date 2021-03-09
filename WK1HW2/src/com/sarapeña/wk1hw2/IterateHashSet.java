package com.sarapeña.wk1hw2;

import java.util.*;
import java.util.Iterator;

public class IterateHashSet {

    public static void main(String[] args) {
        // Write a Java program to iterate through all elements in a hash list.

        // Create a empty hash set
        HashSet<String> hashset = new HashSet<String>();

        // use add() method to add values in the hash set
        hashset.add("Blue");
        hashset.add("Green");
        hashset.add("Black");
        hashset.add("White");
        hashset.add("Pink");
        hashset.add("Yellow");

        // set Iterator
        Iterator<String> p = hashset.iterator();

        // Iterate the hash set
        while (p.hasNext()) {
            System.out.println(p.next());
        }

    }

}
