import java.util.Scanner;

class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    int employeeId;
    
    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
    
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        displayPerson();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();

        Employee emp = new Employee(name, age, id);

      
        System.out.println("Employee Details");
        emp.displayEmployee();
    }
}
