package classes_and_objects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Tarun",123);
        s1.print();

        Student s2 = new Student("Shinchan", 223);
        s2.print();
        System.out.println(Student.getNumStudents());
    }
}

/*
* Within the same package, we don't have to write the import statement to import a class
*
 */