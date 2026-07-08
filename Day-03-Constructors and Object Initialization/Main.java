class Student {
    int id;
    String name;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void displayDetails() {
        System.out.println("Student Details: ");
        System.out.println(id);
        System.out.println(name);
    }
}

public class Main {
    public static void main(String args[]) {
    Student obj1 = new Student(101, "Pavani");
    Student obj2 = new Student(102, "Swetha");    
        
    obj1.displayDetails();
    obj2.displayDetails();
    }
}