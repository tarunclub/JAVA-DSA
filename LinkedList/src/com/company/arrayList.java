package com.company;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
//        System.out.println(list1.size());
        list1.add(1);
        list1.add(2);
        list1.add(3);
//        System.out.println(list1.size());
//        System.out.println(list1.get(2));
        list1.add(2, 50);
        list1.remove(1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+" ");
        }

        for (int element: list1) {
            System.out.print(element+" ");
        }
    }
}
