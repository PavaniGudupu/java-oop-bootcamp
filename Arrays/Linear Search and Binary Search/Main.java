import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int search = sc.nextInt();
        boolean found = false;
        
        for(int i=0; i<size; i++) {
            if(arr[i] == search) {
                System.out.println("Found at Index " + i);
                found = true;
                break;
            }
        }
        
        if(!found) {
            System.out.println("Not Found");
        }
    }
}


import java.util.*;

public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int search = sc.nextInt();
        Arrays.sort(arr);
        
        int index = Arrays.binarySearch(arr, search);
        if(index >= 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
