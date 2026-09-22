/* ----
Create:
public static <T extends Number> double square(T value)

It should return the square of the given number.
Example:
Input: 5
Output: 25.0
----- */




import java.util.*;

public class Main {
    public static <T extends Number> double square(T value) {
        return value.doubleValue() * value.doubleValue();
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        Integer num = sc.nextInt();
        Double result = square(num);
        System.out.println("Output: " + result);
    }
}