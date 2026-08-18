
abstract class Vehicle {
    String brand;
    double speed;
    Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
    
    abstract void calculateAcceleration();

}


class Car extends Vehicle {
    Car(String brand, double speed) {
        super(brand, speed);
    }
    
    @Override
    void calculateAcceleration() {
        double accelerate = speed * 0.10;
        System.out.println("Acceleration: " + accelerate);
    }
}


public class Main{
    public static void main(String[] args) {
        Vehicle v = new Car("Tesla", 200);
        v.displayDetails();
        v.calculateAcceleration();
    }
}