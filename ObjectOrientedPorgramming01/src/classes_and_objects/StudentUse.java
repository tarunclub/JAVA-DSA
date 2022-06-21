package classes_and_objects;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Tarun", 123);
        Student s2 = new Student("Goku", 121);
        Student s3 = new Student("Shinchan", 432);
        s1.print();
        s2.print();
        s3.print();
    }
}
