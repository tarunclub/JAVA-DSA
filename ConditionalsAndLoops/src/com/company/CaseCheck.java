package com.company;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char name = sc.nextLine().charAt(0);

        if(name >= 'a' && name <= 'z'){
            System.out.println("Lowercase is not allowed");
        }else{
            System.out.println("Welcome!!");
        }
    }
}
