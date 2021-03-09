package com.sarapeña.wk1hw2;

import java.util.ArrayList;

public class ReplaceElement {


    public static void main(String[] args) {
        //Write a Java program to replace the second element of a ArrayList with the specified element.
        ArrayList<String>  color = new ArrayList<String>();

        color.add("Blue");
        color.add("Yellow");

        System.out.println("This is the original array list: " + color);
        String new_color = "White";
        color.set(1,new_color);

        int num=color.size();
        System.out.println("Replace second element with 'White'.");

        for(int i=0;i<num;i++)
            System.out.println(color.get(i));

    }

}