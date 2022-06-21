package vehicle;

public abstract class Car extends Vehicle{
    int numGears;
    boolean isConvertible;

    public boolean isConvertible() {
        return isConvertible;
    }

    @Override
    public boolean isMotorized() {
        return true;
    }

    public Car(int numGears, int maxSpeed) {
        super(maxSpeed);
        this.numGears = numGears;
        System.out.println("Car constructor");
    }

    public void printCar(){
        super.print();
        System.out.println("Number of gears: "+numGears);
        System.out.println("Is convertible: "+isConvertible);
    }
}
