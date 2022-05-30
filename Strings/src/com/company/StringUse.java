package com.company;

public class StringUse {
    public static void main(String[] args) {
        char ch = 'a';
        String str = "abcdefg";

//        Functions of string
        /*
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.substring(1,6));
        System.out.println(str.substring(1));
        System.out.println(str.substring(str.length()-1));
        System.out.println(str.contains("cde"));

         */
        print(str);
    }

    public static void print(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
