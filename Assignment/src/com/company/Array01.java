package com.company;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class Array01 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        System.arraycopy(nums,0,ans,0,n);
        System.arraycopy(nums,0,ans,n,n);

        return ans;
    }
}
