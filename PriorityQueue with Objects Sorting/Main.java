import java.util.*;

class Student{
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
        
        PriorityQueue<Student> pq = new PriorityQueue<>((a, b) -> {
            if(a.marks != b.marks) {
                return Integer.compare(b.marks, a.marks);
            }
            return a.name.compareTo(b.name);
        });
        
        pq.add(new Student(101, "Pavani", 85));
        pq.add(new Student(102, "Rahul", 92));
        pq.add(new Student(103, "Swetha", 78));
        pq.add(new Student(104, "Hari", 92));
        pq.add(new Student(105, "Alice", 88));
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}