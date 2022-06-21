package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(234);
        int product = product(505);
        System.out.println(ans);
        System.out.println(product);
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }

    static int product(int n){
        if(n==0) return 1;
        int smallAns=product(n/10);
        return n%10*smallAns;
    }
}
