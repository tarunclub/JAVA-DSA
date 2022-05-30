package com.company;

public class Array03 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1}
        };
//        System.out.println(arr[0][0]);
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = accounts[i][j] + accounts[i+1][j+1];
            }
        }
        return sum;
    }
}
