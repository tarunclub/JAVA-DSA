package vehicle;

import vehicle_temp.Truck;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle(180);
//        v1.print();

        Car c = new Car(10,180);
        Truck t = new Truck(180,10000);
//        c.numGears = 10;
        c.color = "Black";
        c.setMaxSpeed(180);
        c.isConvertible = true;
//        c.print();

//        Polymorphism

        Vehicle v = new Car(10,180);

    }
}
