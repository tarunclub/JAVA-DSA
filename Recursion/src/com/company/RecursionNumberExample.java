package com.company;

public class RecursionNumberExample {

    public static void main(String[] args) {
	// write your code here
        print(1);
    }

    static void print(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

//        This is the last statement in the function call hence we call it tail recursion
        print(n+1);
    }


}
