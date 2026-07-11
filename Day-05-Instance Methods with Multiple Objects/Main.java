class Employee {
    int employeeId;
    String employeeName;
    double salary;
    static String company = "TCS";
    
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    
    public void displayDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
    }
}


public class Main {
    public static void main(String args[]) {
        Employee emp1 = new Employee(101, "Pavani", 45000);
        Employee emp2 = new Employee(102, "Rahul", 55000);
        Employee emp3 = new Employee(103, "Swetha", 60000);
        
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}


