import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int[] arr = {2, 12, 23, 34, 45, 67, 89};  // Sorted array
        
        // Search for element
        int key = 45;
        int index = Arrays.binarySearch(arr, key); //returns index
        
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found. Insertion point: " + (-index - 1));
        }
    }
}
.