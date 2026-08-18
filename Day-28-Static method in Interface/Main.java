interface Calculator {

    static void version() {
        System.out.println("Calculator Version 1.0");
    }

    int add(int a, int b);
}

class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

}

public class Main {
    public static void main(String args[]) {
        Calculator.version();
        Calculator obj = new SimpleCalculator();
        System.out.println(obj.add(10, 20));
        
    }
}