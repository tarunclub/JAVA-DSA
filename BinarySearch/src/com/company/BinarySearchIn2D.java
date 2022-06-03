package com.company;

import java.util.Arrays;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 8;
        int[] ans = search(nums,target);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int start = 0;
                int end = nums[i].length-1;
                while (start <= end){
                    int mid = start+(end-start)/2;

                    if(target > nums[i][mid]){
                        start = mid+1;
                    }else if(target < nums[i][mid]){
                        end = mid-1;
                    }else{
                        return new int[]{i,mid};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
}
