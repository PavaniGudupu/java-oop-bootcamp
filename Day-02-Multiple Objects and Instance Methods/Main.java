class Student {
    int id;
    String name;
}

public class Main {
    public static void main(String args[]) {
    
    Student std1 = new Student();
    std1.id = 101;
    std1.name = "Pavani";
    
    Student std2 = new Student();
    std2.id = 102;
    std2.name = "Rahul";
    
    System.out.println("Student 1 Details: ");
    System.out.println(std1.id);
    System.out.println(std1.name);
    
    System.out.println("Student 2 Details: ");
    System.out.println(std2.id);
    System.out.println(std2.name);
        
    }
}