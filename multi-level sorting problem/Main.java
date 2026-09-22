import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;
    String department;

    Student(int id, String name, int marks, String department) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.department = department;
    }

    @Override
    public int compareTo(Student object) {
        return this.department.compareTo(object.department);
    }


    @Override
    public String toString() {
        return id + " " + name + " " + marks + " " + department;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Pavani", 85, "CSE"));
        list.add(new Student(102, "Rahul", 92, "CIVIL"));
        list.add(new Student(103, "Swetha", 92, "Mechanical"));
        list.add(new Student(104, "Hari", 85, "ECE"));
        list.add(new Student(105, "Anil", 92, "EEE"));

        list.sort((a, b) -> {
            if(a.department != b.department) {
                return a.department.compareTo(b.department);
            }
            if(a.marks != b.marks) {
                return Integer.compare(b.marks, a.marks);
            }
            if(a.name != b.name) {
                return a.name.compareTo(b.name);
            } 
            return Integer.compare(a.id, b.id);
        });

        for (Student obj : list) {
            System.out.println(obj);
        }
    }
}
