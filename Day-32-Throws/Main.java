import java.util.*;

class CustomeException extends Exception{
    public CustomeException(String message) {
        super(message);
    }
}

class C{
    public void check(int num) throws CustomeException {
        if(num<=0) {
            throw new CustomeException("Number must be positive");
        }
    }
}

class B{
    C obj = new C();
    public void start(int num) throws CustomeException{
        obj.check(num);
    }
}

class A{
    B obj = new B();
    public void process(int num) throws CustomeException{
        obj.start(num);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        A obj = new A();
        System.out.println("Enter the age: ");
        try {
            int num = sc.nextInt();      
            obj.process(num); 
            System.out.println("Valid number: " + num);
        } catch (CustomeException e) {
            System.out.println("Error message: " + e);
        }

    

        
        
    }
}