package com.sarapeña.wk1hw2;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

    public static void main(String[] args) {
        // Write a Java program of swap two elements in an array list

        ArrayList<String> arrayList= new ArrayList<String>();

        arrayList.add("Blue");
        arrayList.add("Green");
        arrayList.add("Black");
        arrayList.add("White");
        arrayList.add("Pink");

        System.out.println("Array list before Swap:");
        for(String a: arrayList){
            System.out.println(arrayList);
        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(arrayList, 0, 2);

        System.out.println("Array list after swap:");
        for(String b: arrayList){
            System.out.println(b);
        }
    }

}