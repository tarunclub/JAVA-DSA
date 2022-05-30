package com.company;

public class StringStoring {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = "abc";

        reverse(c);
    }

    public static void reverse(String str){
        for (int i = str.length() - 1,j = 0; i >= j ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
