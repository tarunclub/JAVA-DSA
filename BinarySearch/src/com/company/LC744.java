package com.company;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class LC744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        char ans = nextCharacter(letters,target);
        System.out.println(ans);
    }

    public static char nextCharacter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

                if(target > letters[mid]){
                    start = mid + 1;
                }else{
                    end = mid;
                }
        }
        return letters[end];
    }
}
