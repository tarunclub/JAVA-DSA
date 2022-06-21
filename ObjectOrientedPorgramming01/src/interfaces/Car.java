package interfaces;

public class Car extends Vehicle implements VehicleInterface, CarInterface{

    @Override
    public void print() {

    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public void getCompany() {

    }
}
