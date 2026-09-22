class Vehicle {
    public void start() {
        System.out.println("Vehicle start");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    } 
    
    public void openSunroof() {
        System.out.println("Sunroof opened");
    }
}

public class Main {
    public static void main(String args[]) {
        Vehicle v = new Car();
        v.start();
        
        Car c = (Car) v;
        c.openSunroof();
    }
}