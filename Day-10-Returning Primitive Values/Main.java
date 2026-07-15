import java.util.*;

class Employee {
    int employeeId;
    String employeeName;
    double salary;
    
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
}

class Company {
    public static double AverageSalary(Employee[] employees) {
        int noOfEmployees = employees.length;
        double sumOfEmployees = 0;
        for(Employee emp: employees) {
            sumOfEmployees += emp.salary;
        }
        
        double average = sumOfEmployees / noOfEmployees;
        return average;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        Employee[] empArray = new Employee[size];
        
        for(int i=0; i<size; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            
            empArray[i] = new Employee(id, name, salary);
        }
        
        double result = Company.AverageSalary(empArray);
        System.out.println("Average Salary: " + result);
        
        
    }
}