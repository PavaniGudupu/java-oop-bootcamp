
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

public class Main{
    public static void main(String args[]) {
        Vehicle v = new Car();
        v.start();
    }
}