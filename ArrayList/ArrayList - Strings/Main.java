import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        // Array
        String[] arr = {"Apple", "Boy", "Cat", "Dog"};
        
        // Array --> ArrayList 
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(arr));
        
        // Add / Insert
        arrayList.add("Mango");
        
        // Update
        arrayList.set(1, "Boll");
        
        // Remove
        arrayList.remove("Mango");
        arrayList.remove(1);
        
        // Search 
        if(arrayList.contains("Cat")) {
            System.out.println("Found Cat at index of:  " + arrayList.indexOf("Cat"));
            System.out.println("Last Index of cat is : " + arrayList.lastIndexOf("Cat"));
        }
        
        // Reverse
        
        Collections.reverse(arrayList);
        System.out.println(arrayList);        
        
        // Sort
        
        Collections.sort(arrayList);
        System.out.println(arrayList);


        // Size
        
        System.out.println(arrayList.size());
        
        // ArrayList --> Array
        String[] newArray = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(newArray));
        
    }
}