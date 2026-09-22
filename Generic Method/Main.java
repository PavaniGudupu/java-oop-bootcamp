/*---
Generic Methods:
A generic method is a method that can work with different data types.
--*/

import java.util.*;

class Box<T> {
    T value;
    Box(T value) {
        this.value = value;
    }
}

public class Main {
    //  <T> - comes before the return type.
    // Generic method
    public static <T> void display(T value) {
        System.out.println(value);
    }
    
    // Generic array method
    public static <T> void printValue(T[] array) {
        for(T x: array) {
            System.out.println(x);
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        Box<Integer> obj1 = new Box<>(10);
        Box<String> obj2 = new Box<>("Java");
        Box<Double> obj3 = new Box<>(52.84);
        Box<Character> obj4 = new Box<>('C');
        
        display(obj1.value);
        display(obj2.value);
        display(obj3.value);
        display(obj4.value);
        
        Integer[] arr1 = {1, 2, 3, 4};
        String[] arr2 = {"java", "python", "cSharp"};
        Double[] arr3 = {23.34, 45.32, 45.56};
        System.out.println();
        
        printValue(arr1);
        printValue(arr2);
        printValue(arr3);
        

    }
    
}