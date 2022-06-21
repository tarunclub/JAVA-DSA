package vehicle_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
    int maxLoadCapacity;

    public Truck(int maxSpeed, int maxLoadCapacity) {
        super(maxSpeed);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public boolean isMotorized() {
        return true;
    }

    public void printTruck(){
        System.out.println("Truck capacity is: "+maxLoadCapacity);
        System.out.println("Truck Color: "+color);
        System.out.println("Truck maxSpeed: "+getMaxSpeed());
    }
}
