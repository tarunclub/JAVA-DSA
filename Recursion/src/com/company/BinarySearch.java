package com.company;

public class BinarySearch {
    public static void main(String[] args) {

    }

    static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target ){
            return mid;
        }

        if(target < arr[mid]){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
}
