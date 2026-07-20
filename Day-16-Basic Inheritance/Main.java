import java.util.Scanner;

// Parent class
class Person {
    String name;
    int age;

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Employee extends Person {
    int employeeId;

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        // Reuse parent members
        displayPerson();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();

        // Create Employee object
        Employee emp = new Employee();
        emp.employeeId = id;
        emp.name = name;   // inherited from Person
        emp.age = age;     // inherited from Person

        // Output
        System.out.println("Employee Details");
        emp.displayEmployee();
    }
}
