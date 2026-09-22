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

    public static void removeStudent(ArrayList<Student> students, int id) {
        // Remove the student whose id matches
        
        for(Student std: students) {
            if(std.id == id) {
                continue;
            }
        }
        
    }
    

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Pavani"));
        students.add(new Student(102, "Rahul"));
        students.add(new Student(103, "Swetha"));

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();

        removeStudent(students, id);

        for(Student s : students)
            s.display();
    }
}