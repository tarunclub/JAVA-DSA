package vehicle;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("black",100);
        v.print();

        Car c = new Car();
        c.setMaxSpeed(100);
        c.print();
    }
}
