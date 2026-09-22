import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int[] arr = {12, 45, 2, 67, 34, 89, 23};
        
        int min = arr[0];
        int max = arr[0];
        for(int val: arr) {
            if(val < min) {
                min = val;
            }
            if(val > max) {
                max = val;
            }
        }
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
