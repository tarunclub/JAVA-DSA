package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Input the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the target you wanna search");
        int target = sc.nextInt();

        int searchResult = search(arr,target);

        System.out.println("The target is present at the index: "+searchResult);
    }


    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid = start+(end-start)/2;

        for (int i = 0; i < arr.length; i++) {
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

