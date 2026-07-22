import java.util.*;

class Calculator {
    public int calculateMarks(int mark1, int mark2)
    {
        return mark1 + mark2;
    }
    
    public double calculateMarks(int mark1, int mark2) {
        return mark1 + mark2 + mark3;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        // int m5 = sc.nextInt();
        
        Calculator obj = new Calculator();
        int total2subjects = obj.calculateMarks(m1, m2);
        double total3subjects = obj.calculateMarks(m3, m4);
        
        System.out.println("Total of 2 subjects: " + total2subjects);
        System.out.println("Total of 3 subjects: " + total3subjects);
    }
}