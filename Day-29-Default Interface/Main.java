interface Animal {
    void sound();

    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog implements Animal{
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.sound();
        obj.sleep();
    }
}