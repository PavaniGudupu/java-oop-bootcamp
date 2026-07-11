class Student {
    int id;
    String name;
    static String school = "ABC Public School";
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void displayDetails() {
        System.out.println("Student Details: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("School: " + school);
    }
}

public class Main {
    public static void main(String args[]) {
    Student obj1 = new Student(101, "Pavani");
    Student obj2 = new Student(102, "Rahul");    
        
    obj1.displayDetails();
    obj2.displayDetails();
    }
}