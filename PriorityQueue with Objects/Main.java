import java.util.*;

class Student {
    int id;
    String name;
    int marks;
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
       @Override
    public String toString() {
        return id + " " + name + " " + marks;
    } 
}

public class Main {
    public static void main(String args[]) {

        
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.marks, a.marks));
        pq.add(new Student(101, "Alice", 85));
        pq.add(new Student(102, "Bob", 92));
        pq.add(new Student(103, "Charlie", 78));
        pq.add(new Student(104, "Diana", 95));
        pq.add(new Student(105, "Eve", 88));
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}