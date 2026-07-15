import java.util.*;

class Employee {
    int employeeId;
    String employeeName;
    
    Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

class Company {
    public static Employee findEmployeeById(Employee[] employees, int searchId) {
        for (Employee emp : employees) {
            if (searchId == emp.employeeId) {
                return emp;
            }
        }
        return null; // only after checking all
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Employees");
        int size = sc.nextInt();
        
        Employee[] employeeArray = new Employee[size];
        
        for (int i = 0; i < employeeArray.length; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            employeeArray[i] = new Employee(id, name);
        }
        
        int searchId = sc.nextInt();
        
        Employee result = Company.findEmployeeById(employeeArray, searchId);
        if (result != null) {
            System.out.println("Employee found");
            result.displayDetails();
        } else {
            System.out.println("Employee Not found");
        }
        
        sc.close();
    }
}
