package com.company;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the WORD");
//        String str = sc.next();
        String str = "tarun";
        System.out.println(palindrome(str));


    }

    public static boolean palindrome(String str){
        for (int i = 0,j =  str.length() - 1;i < j; i++,j--) {
            if(str.charAt(i) == str.charAt(j)){
                return true;
            }
        }
        return false;
    }
}
