package com.company;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Explicit typecasting
        int num = (int)(67.56f);

//        automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);

        /*
        The maximum range of byte is 256 so the result is the remainder which is actually 1
         */
        System.out.println(b);
    }
}
