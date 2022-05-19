package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int a = sc.nextInt();

        System.out.println("Enter second Number");
        int b = sc.nextInt();

        int result = sum(a,b);
        System.out.println("The sum of both the numbers is "+result);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

