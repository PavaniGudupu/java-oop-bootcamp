// Convert an array of strings {"red", "blue", "green"} into an ArrayList. Remove "blue" and print the result.

import java.util.*;


public class Main {
    public static void main(String args[]) {
        String[] arr = {"red", "blue", "green"};
        
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
        arrayList.remove("blue");
        
        String[] newArray = arrayList.toArray(new String[0]);
        System.out.println("New Array without blue: " + Arrays.toString(newArray));
    }
}