package vehicle;

public abstract class Vehicle {
    protected String color;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle constructor");
    }

    public abstract boolean isMotorized();

    public abstract String getCompany();

    public final void print(){
        System.out.println("The color of vehicle is: "+this.color+" and max speed is: "+this.maxSpeed);
    }

//    public Vehicle(String color, int maxSpeed) {
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//    }
}
