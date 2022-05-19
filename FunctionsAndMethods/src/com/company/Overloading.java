package com.company;

public class Overloading {
    public static void main(String[] args) {
        fun(23);
        fun("Tarun");
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }
}

/*
Two or more functions with the same name can exist if the arguments are different
This thing happens at the compile time so this will not show the error
 */

