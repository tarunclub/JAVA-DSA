package com.company.staticExample;

public class Main {
    public static void main(String[] args) {
        Human tarun = new Human("Tarun",19,400000,false);
        Human goku = new Human("Goku",400,300000,true);

        tarun.print();
        goku.print();
    }
}
