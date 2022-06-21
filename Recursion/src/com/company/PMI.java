package com.company;

public class PMI {
    public static void main(String[] args) {
        int ans = pmi(10);
        System.out.println(ans);
    }

    public static int pmi(int n){
        if(n==0){
            return 1;
        }
        return n+pmi(n+1);
    }
}
