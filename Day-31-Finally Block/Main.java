import java.util.;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;
        try{
            result = a  b;
            System.out.println(Result  + result);
        } 
        catch(ArithmeticException e) {
            System.out.println(Cannot divide by zero);
        } 
        finally {
            System.out.println(Program Ended);
        }
    }
}