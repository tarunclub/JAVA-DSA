package com.company;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6,8, 10, 14, -11};
        System.out.println();
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
