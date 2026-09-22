import java.util.*;

class Student<T, U, V> {
    T first;
    U second;
    V third;
    
    Student(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public void display() {
        System.out.println(first + " " + second + " " + third);
    }
}

public class Main {
    public static void main(String args[]) {
        
        Student<Integer, String, Double> obj1 = new Student<>(101, "Pavani", 89.5);
        Student<Integer, String, Double> obj2 = new Student<>(102, "Rahul", 92.0);
        Student<Integer, String, Double> obj3 = new Student<>(103, "Swetha", 95.5);
        
        obj1.display();
        obj2.display();
        obj3.display();
    }
}