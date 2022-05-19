package com.company;

import java.util.Arrays;

//Variable length arguments when we dont know how many arguments we have to pass
public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
