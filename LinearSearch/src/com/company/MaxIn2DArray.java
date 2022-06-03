package com.company;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };

        System.out.println(max(arr));
    }

    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
