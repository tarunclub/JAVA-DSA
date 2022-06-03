package com.company;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 14, 16, 18, 20, 24, 28, 32};
        int target = 15;
        System.out.println(floor(arr,target));
    }

    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while (start <= end){
            int mid = start+(end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start-1;
    }
}
