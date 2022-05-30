package com.company.staticExample;

public class Human {
    String name;
    int age;
    float salary;
    boolean isMarried;

    static int population;

    public Human(String name, int age, float salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;

        population++;
    }

    public void print(){
        System.out.println(name+" "+age+" "+salary+" "+isMarried+" "+population);
    }
}
