package com.company;

public class BinarySearch {

    public static void main(String[] args) {
	    int[] arr = {2, 4, 6, 8, 10, 14, 16, 18, 32, 48};
        int target = 10;
        int ans = search(arr,target);

        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start+(end-start)/2;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > target){
                    start = mid + 1;
                }else if(arr[i] < target){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
