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

public class Main {
    public static void main(String args[]) {
        Employee employeeArray[] = new Employee[3];
        
        employeeArray[0] = new Employee(101, "Pavani");
        employeeArray[1] = new Employee(102, "Rahul");
        employeeArray[2] = new Employee(103, "Swetha");
        
        for(Employee emp: employeeArray) {
            emp.displayDetails();
        }
        
        
        //System.out.println(employeeArray[1] == null);
        
    }
}