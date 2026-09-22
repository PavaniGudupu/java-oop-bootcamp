import java.util.*;

class Student {
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

    public static void updateMarks(ArrayList<Student> students, 
    int searchId, double newMarks) {
    
        for(Student obj: students) {
            if (obj.id == searchId) {
                
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Pavani", 85));
        students.add(new Student(102, "Rahul", 78));
        students.add(new Student(103, "Swetha", 91));

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        double marks = sc.nextDouble();

        updateMarks(students, id, marks);

        for(Student s : students)
            s.display();
    }
}