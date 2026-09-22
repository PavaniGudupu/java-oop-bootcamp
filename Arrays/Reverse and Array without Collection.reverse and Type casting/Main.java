import java.util.*;

public class Main {
    public static void main(String args[]) {
        Integer[] arr = {12, 45, 2, 67, 34, 89, 23};
        
        
        //Reverse printing but not acutally array reverse
        for(int i=arr.length - 1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nNot Reversed: " + Arrays.toString(arr));
        
        //Collection
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(arrayList);
        System.out.println("Revered using ArrayList: " + arrayList);
        
        //While Loop - Easy
        
        int i=0, j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        System.out.println("\n\nReversed: " + Arrays.toString(arr));
        
       // Reverse manually by swapping - For Loop
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }        
        
    }
}