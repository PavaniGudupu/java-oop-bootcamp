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
    
    public void displayDetail() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

class Company {
    public static Employee[] findEmployees(Employee[] employees) {
        List<Employee> resultArray = new ArrayList<>();
        
        for(Employee emp: employees) {
            if(emp.salary > 50000) {
                resultArray.add(emp);
            }
        }
        
        return resultArray;
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
    
    Employee[] result = Company.findEmployees(empArray);
    if(result != null) {
        for(Employee resultIterator: result) {
            resultIterator.displayDetail();
        }
    } else {
        System.out.println("No Employees Found");
    }
    
    
    
    }
}