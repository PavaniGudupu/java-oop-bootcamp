/******************************************************************************
 List Demo
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Empty list
        List<Integer> list1 = new ArrayList<>();
        
        // List with elements (fixed-size from Arrays.asList)
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        List<String> stringList = new ArrayList<>(Arrays.asList("Apple", "Boy", "Cat", "Dog"));
        
        // ✅ Add / Insert
        list1.add(651);
        integerList.add(70);
        stringList.add("Mango");
        
        System.out.println("After add:");
        System.out.println(list1);
        System.out.println(integerList);
        System.out.println(stringList);
        
        // ✅ Update
        integerList.set(5, 80);   // replace 60 with 80
        stringList.set(1, "Boll"); // replace "Boy" with "Boll"
        
        System.out.println("\nAfter update:");
        System.out.println(integerList);
        System.out.println(stringList);
        
        // ✅ Remove
        integerList.remove(0);                     // remove by index
        integerList.remove(Integer.valueOf(40));   // remove by value
        stringList.remove("Apple");                // remove by value
        stringList.remove(2);                      // remove by index
        
        System.out.println("\nAfter remove:");
        System.out.println(integerList);
        System.out.println(stringList);
        
        // ✅ Loop
        System.out.println("\nLoop through integerList:");
        for (int val : integerList) {
            System.out.print(val + " ");
        }
        
        // ✅ Search
        System.out.println("\n\nSearch:");
        System.out.println("Contains 80? " + integerList.contains(80));
        System.out.println("Index of Mango: " + stringList.indexOf("Mango"));
        
        // ✅ Copy
        List<Integer> copyList = new ArrayList<>(integerList);
        System.out.println("\nCopy of integerList: " + copyList);
        
        // ✅ Sort & Reverse
        Collections.sort(integerList);
        Collections.reverse(stringList);
        System.out.println("\nAfter sort & reverse:");
        System.out.println(integerList);
        System.out.println(stringList);
        
        // ✅ Convert to Array
        Integer[] arr = integerList.toArray(new Integer[0]);
        System.out.println("\nConverted to array: " + Arrays.toString(arr));
        
        // ✅ Size
        System.out.println("\nSize of integerList: " + integerList.size());
    }
}
