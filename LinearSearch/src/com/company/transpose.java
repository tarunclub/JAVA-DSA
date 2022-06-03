package com.company;

import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[] arr = {3,4,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int j = 1;
        for(int i=0;i<=nums.length;i++){
            if(nums[i]+nums[i+j] == target){
                return new int[]{i,i+j};
            }else{
                j++;
            }
        }
        return new int[]{-1,-1};
    }
}
