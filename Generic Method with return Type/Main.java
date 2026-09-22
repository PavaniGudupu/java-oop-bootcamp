
import java.util.*;

public class Main {
    // Generic method - return value
    public static <T> T getValue(T value) {
        return value;
    }
    //Generic method - return object value
    public static <T> T getFirst(T[] value) {
        return value[0];
    }
    
    public static void main(String args[]) {
        Integer a = getValue(10);
        String b = getValue("Java");
        Double c = getValue(12.345);
        Character d = getValue('C');
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        Integer[] arr1 = {1, 2, 3, 4};
        String[] arr2 = {"Java", "Python", "Csharp"};
        Double[] arr3 = {12.23, 34.34, 56.67, 67.45};
        Character[] arr4 = {'C', 'H', 'A', 'R'};

        System.out.println(getFirst(arr1));
        System.out.println(getFirst(arr2));
        System.out.println(getFirst(arr3)); 
        System.out.println(getFirst(arr4));
        
    }
}