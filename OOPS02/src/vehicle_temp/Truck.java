package vehicle_temp;

import vehicle.Vehicle;

public class Truck extends Vehicle {
    int maxLoadingCapacity;
    public void print(){
        System.out.println("Truck Capacity: "+maxLoadingCapacity);
        System.out.println("Truck color: "+color); //because the string is not protected
        System.out.println("Truck Speed: "+getMaxSpeed());
    }
}
