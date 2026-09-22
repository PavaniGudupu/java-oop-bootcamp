// 🚀 Next: Bounded Generics - extends Sometimes we don't want to allow every type.
// <T extends Number>

public class Main {
    
    // Generic method restricted to subclasses of Number
    public static <T extends Number> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        // ✅ Valid calls
        display(10);          // Integer
        display(10.5);        // Double
        display(23.45f);      // Float
        display(123456789L);  // Long

        // ❌ Invalid call
        // display("Java");      // String
    }
}
