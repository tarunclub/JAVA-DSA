package com.company;

public class EvenDigits01 {
    public static void main(String[] args) {
        int[] nums = {12, 245, 67, 890, 1};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums){
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = numOfDigits(nums[i]);

            if(digits % 2 == 0){
                  number++;
            }
        }
        return number;
    }

    public static int numOfDigits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
