package com.sarapeña.wk1hw2;

import java.util.ArrayList;

public class TrimArrayList {

    public static void main(String[] args) {
        // Write a Java program to trim the capacity of an array list the current list size

        ArrayList<String> arrayList= new ArrayList<String>();

        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Black");
        arrayList.add("White");
        arrayList.add("Pink");

        System.out.println("Original array list: " + arrayList);

        System.out.println("Let trim to size the above array: ");

        arrayList.trimToSize();
        System.out.println(arrayList);

    }

}