package com.company;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        Syntax
        ArrayList<Integer> list = new ArrayList<>();

        list.add(67);
//        If an element is present in an arraylist or not
        System.out.println(list.contains(67));

//        To set a value here 0 is the index number we can set it however we want
        list.set(0,10);

        System.out.println(list);
    }
}
