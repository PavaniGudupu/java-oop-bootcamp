/******************************************************************************
💻 Coding Challenge 3

Create:

[10, 20, 30, 40, 50]

Then:

Insert 100 at index 2
Insert 200 at index 4
Remove the element at index 1
Remove the value 40
Display the final list

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Create LinkedList with initial elements
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        
        list.add(2, 100);
        list.add(4, 200);
        list.remove(1);
        list.remove(Integer.valueOf(40));
        System.out.println(list);
    }
}
