package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number");
        int fNum = sc.nextInt();

        System.out.println("Enter the second Number");
        int sNum = sc.nextInt();

        int sum = fNum+sNum;
        System.out.println("The sum is "+sum);
    }
}
