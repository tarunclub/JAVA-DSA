package com.company;

import java.util.Scanner;

public class printNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number till you want to print");
        int n = sc.nextInt();

        print(n);
    }

    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
