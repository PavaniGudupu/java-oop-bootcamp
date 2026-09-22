


// DSA PROBLEM - NOT SOLVED YET

import java.util.*;

class Student{
    int id;
    String name;
    double marks;
    
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    void display() {
        System.out.println(id + " " + name + " " + marks);
        
    }
}

public class Main {
    
    public static void sortStudents(ArrayList<Student> students) {
        
        ArrayList<Student> descendingSortArray = new ArrayList<>();
        double highestMark = 0;
        
        // List<Student> normalList = students;
        
        for(Student obj : students) {
            
            // normalList.sort((a,b) -> b.compare(a));
            
            if(obj.marks > highestMark) {
                highestMark = obj.marks;
                
                descendingSortArray.add(obj);
                
                for(Student descStd: descendingSortArray) {
                    Student currentObj = descStd.get(0);
                    if(highestMark > currentObj.marks) {
                        descendingSortArray.add(0, obj);
                    }
                }
                
                
            }
            
            
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student(101, "Pavani", 85));
        students.add(new Student(102, "Rahul", 78));
        students.add(new Student(103, "Swetha", 91));
        students.add(new Student(104, "Ravi", 80));
        
        sortStudents(students);
        for(Student std: students) {
            std.display();
        }
    }
}