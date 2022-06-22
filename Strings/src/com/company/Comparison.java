package com.company;

public class Comparison {
    public static void main(String[] args) {
        String a = "Tarun";
        String b = "Tarun";

//        == checks if reference variables are pointing to same object
        System.out.println(a == b);

        String c = new String("Goku");
        String d = new String("Goku");

//        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(c.charAt(0));
    }

}
