/*---
Reverse an array using recurrsion or an function 
----**/

import java.util.*;

public class Main {
    public static void reverse(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }
        
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        reverse(arr, left + 1, right - 1);
    }
    
    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr, 0, arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
    }
}