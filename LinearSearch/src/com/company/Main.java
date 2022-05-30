package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sc.nextInt();

        System.out.println("The element is at the index: "+linear(arr,target));
    }

    static int linear(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
