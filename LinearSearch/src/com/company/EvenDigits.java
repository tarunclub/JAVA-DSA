package com.company;

public class EvenDigits {
    public static void main(String[] args) {

    }

    public static int findNumbers(int[] nums){
        int count = 0;
        for (int num:nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
        String n = Integer.toString(num);
        if(n.length()%2 == 0){
            return true;
        }
        return false;
    }
}
