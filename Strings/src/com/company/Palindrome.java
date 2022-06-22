package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String text = sc.next();
        boolean ans = palindrome(text);

        System.out.println(ans);
    }

    static boolean palindrome(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(str.length()-1-i)) return true;
        }
        return false;
    }
}
