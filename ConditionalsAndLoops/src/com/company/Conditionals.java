package com.company;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        float salary = sc.nextFloat();

        if(salary>25000){
            salary+=5000;
        }else if(salary>20000){
            salary+=3000;
        }else{
            salary+=1000;
        }

        System.out.println("Your salary after increment is: " + salary);
    }
}
