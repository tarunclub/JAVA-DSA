package classes_and_objects;

public class Student {
    private String name;
    private final int rollNumber;
    protected static int students;

    public void print(){
        System.out.println("My name is "+this.name+" and rollNumber is "+this.rollNumber);
    }

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        students++;
    }
}


/*
    Default: these variables and functions can be used only within the package
    public: these variables and functions can be accessed from anywhere
    private: these variables and functions can be accessed only within the same package
    protected:
 */