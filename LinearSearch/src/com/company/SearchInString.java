package com.company;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        System.out.println("Enter the target character: ");
        char target = sc.next().charAt(0);

        System.out.println(target+" is present at index "+search(str,target));
    }

    static int search(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
