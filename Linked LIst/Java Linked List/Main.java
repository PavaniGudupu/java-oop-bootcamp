/******************************************************************************

Linked List = Linear data structure, mostly used when frequent insertion and deletion but access or reading is slow.
every element containse the next node address (pointer)
instead of shifting it create a node and address to that created node same for deletion as well.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		// Creation
// 		LinkedList<Integer> integerList = new LinkedList<>();
        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
		LinkedList<String> stringList = new LinkedList<>(Arrays.asList("Apple", "Boy", "Cat", "Dog"));
		
		// Add or insertion
		integerList.add(10);              // Add element at end
        integerList.add(1, 20);           // Insert at index
        integerList.addFirst(5);          // Add at beginning
        integerList.addLast(30);          // Add at end

		stringList.add("Mango");
		stringList.add(1, "Fruit");
		stringList.addFirst("Grape");
		stringList.addLast("Strawberry");
		
		System.out.println(integerList);
		System.out.println(stringList);
		
		
		// ****  GET - ACESS 
		
		int first = integerList.getFirst();   // Get first element
        int last = integerList.getLast();     // Get last element
        int val = integerList.get(3);         // Get element at index
        
        System.out.println(first + " " + last + " "  + val);		
		
		
		// Update
		integerList.set(0, 100);
		stringList.set(1, "Boll");
		
		// size
		System.out.println(integerList.size());
		System.out.println(stringList.size());
		
		// remove
		integerList.remove(8);
		integerList.remove(Integer.valueOf(80));
		integerList.removeFirst();
		integerList.removeLast();
		stringList.remove("Apple");
		stringList.removeFirst();
		stringList.removeLast();
		
		// search
		
		if(integerList.contains(10)) {
		    System.out.println("Found 100 at index of: " + integerList.indexOf(100));
		    System.out.println("Found at last index of: " + integerList.lastIndexOf(100));
		}
		
		if(stringList.contains("Fruit")) {
		    System.out.println("Found Fruit at index of: " + integerList.indexOf("Fruit"));
		    System.out.println("Found at last index of: " + integerList.lastIndexOf("Fruit"));
		}
		
		Collections.sort(integerList);
		Collections.reverse(stringList);
				
		System.out.println(integerList);
		System.out.println(stringList);
		

		
		
	}
}
