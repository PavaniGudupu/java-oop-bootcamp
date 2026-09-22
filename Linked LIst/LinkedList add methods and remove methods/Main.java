/******************************************************************************

💻 Coding Challenge 2

Create a LinkedList<Integer> containing:

10 20 30 40 50

Then:

Add 5 at the beginning.
Add 60 at the end.
Remove the first element.
Remove the last element.
Display the final list.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Create LinkedList with initial elements
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        
        list.addFirst(5);
        list.addLast(60);
        list.removeFirst();
        list.removeLast();
        
        System.out.println("Final LinkedList: " + list);
    }
}
