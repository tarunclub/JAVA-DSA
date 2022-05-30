package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the starting index");
        int start = sc.nextInt();

        System.out.println("Enter the ending index");
        int end = sc.nextInt();

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        System.out.println(target+" is present at the index "+search(arr, start, end, target));
    }

    static int search(int[] arr, int start, int end, int target){
        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
