import java.util.*;

class Student {
    private int id;
    private String name;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    
        int id = sc.nextInt();
        String name = sc.next();
    
        Student std = new Student();
    
        std.setId(id);
        std.setName(name);
    
        int rtnId = std.getId();
        String rtnName = std.getName();
        
        System.out.println("Student Details");
        System.out.println("ID: " + rtnId);
        System.out.println("Name: " + rtnName);
    
    }
}