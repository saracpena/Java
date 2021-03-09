package com.sarapeña.wk1hw2;

import java.util.*;

public class CopyArraysList {

    public static void main(String[] args) {
        // Write a Java program to copy one array list into another

        List<String> zoo = new ArrayList<String>();

        zoo.add("Lion");
        zoo.add("Tiger");
        zoo.add("Bears");
        System.out.println("This is the zoo array : "+ zoo);

        List<String> list = new ArrayList<String>();

        list.add("Welcome");
        list.add("Hello");
        list.add("World");
        System.out.println("This is the list array : "+ list);

        // copying the ArrayList zoo to the ArrayList list
        Collections.copy(list,zoo);

        System.out.println("This is the NEW list array : "+ list);
    }

}