package com.sarapeña.wk1hw2;

import java.util.ArrayList;

public class EmptyArrayList {

    public static void main(String[] args) {
        // Write a Java program to test an array list is empty or not

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.isEmpty());     //true

        list.add("A");
        System.out.println("This is the array list: " + list);

        System.out.println(list.isEmpty());     //false

        list.clear();

        System.out.println(list.isEmpty());     //true
    }

}
