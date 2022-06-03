package classes_and_objects;

public class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void print(){
        System.out.println("Student Name is "+name+" and rollNumber is "+rollNumber);
    }
}
