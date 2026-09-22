import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList<Student>

        // Add:
        // (101, "Pavani")
        // (102, "Rahul")
        // (103, "Swetha")

        // Print all students using a for-each loop
        
        
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student(101, "Pavani"));
        array.add(new Student(102, "Rahul"));
        array.add(new Student(103, "Swetha"));
        
        for(Student obj: array) {
            obj.display();
        }
        

    }
}