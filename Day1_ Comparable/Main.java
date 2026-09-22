// Make Student implement Comparable. Sort by ID (Ascending)

import java. util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }       
    
    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
    
}

public class Main {
    public static void main(String args[]) {
        ArrayList<Student> list = new ArrayList<>();
        
        list.add(new Student(101, "Pavani", 85));
        list.add(new Student(102, "Rahul", 92));
        list.add(new Student(103, "Swetha", 78));
        list.add(new Student(104, "Hari", 90));
        
        Collections.sort(list);
        
        for(Student obj: list){
            System.out.println(obj);
        }
    }
}
