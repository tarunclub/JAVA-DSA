package com.company;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 10};
        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
