package classes_and_objects;

public class Student {
    public String name;
    private final int rollNumber;
    private static int numStudents;

//    constructor creation
    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    /*
    public void setRollNumber(int rn){
        if(rn < 0){
            return;
        }
        rollNumber = rn;
    }
     */

    public int getRollNumber(){
        return rollNumber;
    }

    public static int getNumStudents(){
        return numStudents;
    }

    public void print(){
        System.out.println(name+ " " +rollNumber);
    }
}

/*
* Default: means we can access the variables within the package
* private: we can only access the variables inside the same class, more specifically within the scope({})
* public: we can access the variables from anywhere
 */
