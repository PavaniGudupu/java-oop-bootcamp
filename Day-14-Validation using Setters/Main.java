import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    
        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
    
        Student std = new Student();
    
        std.setId(id);
        std.setName(name);
        std.setAge(age);
    
 
        System.out.println("Student Details");
        System.out.println();
        System.out.println("ID: " + std.getId());
        System.out.println("Name: " + std.getName());
        System.out.println("Age: " + std.getAge());
        
    }
}