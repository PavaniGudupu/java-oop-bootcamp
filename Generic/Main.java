import java.util.*;

// Generic - type parameter that allows classes, to operate on different data types 
// Type safety, reusable, no runtime errors, clean code, no unnecessary type casting.

class Box<T> {  //Type
    T value; 
    
    Box(T value) { //Constructor
        this.value = value;
    }
    
    public void display() {
        System.out.println(value);
    }
}

public class Main
{
	public static void main(String[] args) {
        Box<Integer> obj1 = new Box(10);
        Box<String> obj2 = new Box("String");
        Box<Double> obj3 = new Box(10.33);
        
        obj1.display();
        obj2.display();
        obj3.display();
	}
}
