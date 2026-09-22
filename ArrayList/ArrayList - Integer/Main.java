

import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        
        // Primitive Type to ArrayList print
        Integer arr[] = {10, 20, 30, 40};
        
        
        // Array -> ArrayList
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(arr));
        
        
        // Create / add / Insert
        arrayList.add(50);
        
        
        // Update
        arrayList.set(2, 45);
        
        
        // Remove
        arrayList.remove(Integer.valueOf(50));
        arrayList.remove(0);
        
        
        // Index or Search
        if(arrayList.contains(20)){
            System.out.println("Found 20 At index of " + arrayList.indexOf(20));
            System.out.println("Last Index of 20 " + arrayList.lastIndexOf(20));
        }
        
        
        // Sort
        Collections.sort(arrayList);
        System.out.println(arrayList);
        
        
        // Reverse
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        
        
        // Size
        System.out.println(arrayList.size());
        
        
        // Convert to Array
        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArray));
        
    }
}