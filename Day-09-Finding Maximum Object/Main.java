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
    
    public void displayDetails(){
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
    
}

class Company {
    public static Employee findEmployeeWithHighestSalary(Employee[] employees) {
        Employee highest = employees[0];
        
        for(Employee emp: employees) {
            if(highest.salary < emp.salary) {
                highest = emp;
            }
        }
        return highest;
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
        
        
        Employee result = Company.findEmployeeWithHighestSalary(empArray);
        System.out.println("Employee with Highest Salary");
        result.displayDetails();
        
        
    }
}