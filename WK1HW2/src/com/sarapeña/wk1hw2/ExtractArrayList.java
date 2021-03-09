package com.sarapeña.wk1hw2;

import java.util.*;

public class ExtractArrayList {

    public static void main(String[] args) {
        // Write a Java program to extract a portion of a array list

        List<String> list_Strings = new ArrayList<String>();

        list_Strings.add("Blue");
        list_Strings.add("Yellow");
        list_Strings.add("Green");
        list_Strings.add("Black");
        list_Strings.add("White");

        System.out.println("This is the original array list: " + list_Strings);

        List<String> sub_List = list_Strings.subList(3, 5);
        System.out.println("New array list: " + sub_List);
    }

}