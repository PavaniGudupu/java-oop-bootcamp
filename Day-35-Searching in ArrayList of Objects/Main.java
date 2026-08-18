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

    public static Student findStudent(ArrayList<Student> students, int searchId) {

        // Return the student if id matches
        // Otherwise return null
        
        for(Student std: students){
            if(std.id == searchId) {
                return std;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Pavani"));
        students.add(new Student(102, "Rahul"));
        students.add(new Student(103, "Swetha"));

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();

        Student result = findStudent(students, id);

        if(result != null)
            result.display();
        else
            System.out.println("Student Not Found");
    }
}