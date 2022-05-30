package com.company;

public class Main {
    public static void main(String[] args) {
        Student tarun = new Student("Tarun Kumar",123);
        tarun.print();
    }
}

class Student {
    String name;
    int rollNumber;

    Student(){
//        This is how you call a constructor from another constructor
        this("Shinchan",224);
    }

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void print(){
        System.out.println("My name is "+name+" and rollNumber "+rollNumber);
    }
}
