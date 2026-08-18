import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
try {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = 0;
     result = n1 / n2;
    System.out.println("Result: " + result);
}
catch(ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
catch(InputMismatchException e) {
    System.out.println("Invalid Input");
}
        
        
    }
}