import java.util.*;

class SalaryCalculator {
    public double calculateSalary(double basicSalary) {
        return basicSalary;
    }
    
    public double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }
    
    public double calculateSalary(double basicSalary, double bonus, double tax) {
        return basicSalary + bonus - tax;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double basicSalary = sc.nextDouble();
        double bonus = sc.nextDouble();
        double tax = sc.nextDouble();
        
        SalaryCalculator obj = new SalaryCalculator();
        
        // double withoutBonus = obj.calculateSalary(basicSalary);
        // double withBonus = obj.calculateSalary(basicSalary, bonus);
        // double finalSalary = obj.calculateSalary(basicSalary, bonus, tax);
        
        // System.out.println("Salary without bonus: " + withoutBonus); 
        // System.out.println("Salary with bonus: " + withBonus);
        // System.out.println("Final Salary: " + finalSalary);        
        
        System.out.println("Salary without bonus: " + obj.calculateSalary(basicSalary)); 
        System.out.println("Salary with bonus: " + obj.calculateSalary(basicSalary, bonus));
        System.out.println("Final Salary: " + obj.calculateSalary(basicSalary, bonus, tax));
        

        
    }

    
}