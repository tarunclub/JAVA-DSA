package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till you want to print the loop: ");
        int n = sc.nextInt();

//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
        /*
        int num = 1;
        while(num <= n){
            System.out.println(num);
            num+=1;
        }

         */

//        Do-while
        int index = 1;
        do{
            System.out.println(index);
            index++;
        }while (index<=n);
    }
}
