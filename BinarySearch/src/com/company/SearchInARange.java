package com.company;

import java.util.Arrays;

public class SearchInARange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    public static int[] searchRange(int[] nums, int target){
        int first = 0,last = 0;
        for (int i = 0,j= nums.length-1;i < nums.length&&j>0; i++,j--) {
            if(nums[i] == target && nums[j] == target){
                first = i;
                last = j;
            }
        }
        return new int[]{first,last};
    }
}
