package com.company;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        oddEven(n);
    }

    static void oddEven(int n){
        if((n & 1)==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
