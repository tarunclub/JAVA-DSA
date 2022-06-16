package temp;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                reverse(image[i]);
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        swap(arr,start,end);
        start++;
        end--;
    }

    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
