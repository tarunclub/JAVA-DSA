package com.company;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        Syntax
        ArrayList<Integer> list = new ArrayList<>();

        list.add(67);
//        If an element is present in an arraylist or not
        System.out.println(list.contains(67));

        System.out.println(list);
    }
}
