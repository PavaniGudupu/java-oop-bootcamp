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
    public static int countEmployees(Employee[] employees) {
        int count = 0;
        for(Employee emp: employees) {
            if(emp.salary > 50000) {
                count += 1;
            }
        }
        return count;
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
        
        int result = Company.countEmployees(empArray);
        System.out.println("Employees earning more than 50000: " + result);
    }
}