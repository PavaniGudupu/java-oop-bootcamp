import java.util.Scanner;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Person Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    int employeeId;
    
    Employee(int employeeId, String name, int age) {
        super(name, age);
        this.employeeId = employeeId;
    }
    
    public void display() {
        System.out.println("Employee Details");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();

        Employee emp = new Employee(id, name, age);

        emp.display();
    }
}
