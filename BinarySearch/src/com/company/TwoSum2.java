package com.company;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=1;
        while(i<=numbers.length){
            ++j;
            if(numbers[i]+numbers[i+j]==target){
                return new int[]{i+1,i+1+j};
            }
        }
        return new int[]{-1,-1};
    }
}
