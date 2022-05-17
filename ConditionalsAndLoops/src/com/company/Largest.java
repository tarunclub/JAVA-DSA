package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");

        int fnum = sc.nextInt();
        int snum = sc.nextInt();
        int tnum = sc.nextInt();

//        if(fnum>snum&&fnum>tnum){
//            System.out.println(fnum+" is the largest");
//        }else if(snum>fnum&&snum>tnum){
//            System.out.println(snum+" is the largest");
//        }else{
//            System.out.println(tnum+" is the largest");
//        }
        int max = Math.max(tnum,Math.max(fnum,snum));
        System.out.println(max);
    }
}
