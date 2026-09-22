import java.util.*;

class Student {
    int id;
    String name;
    int marks;
    int age;

    Student(int id, String name, int marks, int age) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks + " " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1g01, "Pavani", 85, 23));
        list.add(new Student(102, "Rahul", 92, 22));
        list.add(new Student(103, "Swetha", 92, 24));
        list.add(new Student(104, "Hari", 85, 21));
        list.add(new Student(105, "Anil", 92, 22));
        
       list.sort((a, b) -> {
           if(a.marks != b.marks) {
               return Integer.compare(b.marks, a.marks);
           }
           if(a.age != b.age) {
               return Integer.compare(a.age, b.age);
           }
           return a.name.compareTo(b.name);
       });

        for (Student obj : list) {
            System.out.println(obj);
        }
    }
}
