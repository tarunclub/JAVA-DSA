package classes_and_objects;

public class Fraction {
    float numerator;
    float denominator;

//    Constructor
    public Fraction(float numerator, float denominator){
        this.numerator = numerator;
        if(denominator == 0){
            return;
        }
        this.denominator = denominator;
    }

    public void print(){
        System.out.println(numerator/denominator);
    }
}
