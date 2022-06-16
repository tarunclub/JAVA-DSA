package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtLastUnsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        System.out.println("Enter the number you want to insert: ");
        int n = sc.nextInt();
//        Before inserting
        System.out.println(Arrays.toString(nums));
        nums[5] = n;
//      After inserting
        System.out.println(Arrays.toString(nums));
    }
}
