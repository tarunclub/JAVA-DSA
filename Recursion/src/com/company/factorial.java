package com.company;

public class factorial {
    public static void main(String[] args) {
        int ans = fact(1000);

        System.out.println(ans);
    }

    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        int smallAns = fact(n-1);
        return n * smallAns;
    }
}
