package com.company;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 4, 5, 7, 4, 5};

        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;

        for (int n:arr){
            unique ^= n;
        }

        return unique;
    }

}
