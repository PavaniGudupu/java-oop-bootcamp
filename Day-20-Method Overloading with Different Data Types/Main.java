import java.util.*;
class Student{
    public void displayDetails(int id, String name) {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
    
    public void displayDetails(int id, String name, double marks) {
        // System.out.println("Student ID: " + id);
        // System.out.println("Student Name: " + name);
        displayDetails(id, name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        double marks = sc.nextDouble();
        
        Student obj = new Student();
        obj.displayDetails(id, name);
        obj.displayDetails(id, name, marks);
    }
}