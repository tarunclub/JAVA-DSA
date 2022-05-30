package com.company;

public class fiboProblem {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n){
//        Base Condition
        if(n < 2){
            return n;
        }

//        This is not tail recursion as the last step is not a function call as we are adding both the called
//        values and then passing it
        return fibo(n-1) + fibo(n-2);
    }
}
