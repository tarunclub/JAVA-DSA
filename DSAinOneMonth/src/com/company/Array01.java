package com.company;

//Maximum and minimum of an array using minimum number of comparisons
//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class Array01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 10, 15, -11, -98, 89};

        int min = min(arr);
        int max = max(arr);
        System.out.println("Mininum element in the array is: "+min+" and maximum is "+max);
    }

    static int min(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = arr[0];

            if(arr[i] < min){
                return min = arr[i];
            }
        }
        return -1;
    }

    static int max(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            if(arr[i] == max){
                continue;
            }

            if(arr[i] > max){
                return max = arr[i];
            }
        }
        return -1;
    }
}
