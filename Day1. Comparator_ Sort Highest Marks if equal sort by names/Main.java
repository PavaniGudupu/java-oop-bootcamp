// sort by heighest marks - if marks are equal sort by name

import java. util.*;

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
        return name + " " + marks;
    }
    
}

public class Main {
    public static void main(String args[]) {
        ArrayList<Student> list = new ArrayList<>();
        
        list.add(new Student(101, "Pavani", 85));
        list.add(new Student(102, "Rahul", 92));
        list.add(new Student(103, "Swetha", 78));
        list.add(new Student(104, "Hari", 92));
        
        list.sort((a, b) -> {
            if(a.marks != b.marks) {
                return Integer.compare(b.marks, a.marks);
            }
            return a.name.compareTo(b.name);
        });

        for(Student obj: list){
            System.out.println(obj);
        }
    }
}
