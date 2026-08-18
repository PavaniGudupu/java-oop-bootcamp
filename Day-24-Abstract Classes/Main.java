
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String args[]) {
        Shape obj = new Circle();
        obj.draw();
    }
}