/******************************************************************************
🔥 Coding Challenge 6 — LinkedList as a Deque

Create:

LinkedList<Integer> list

with:

10 20 30 40 50

Perform:

addFirst(100)
addLast(200)
removeFirst()
removeLast()
addFirst(300)

Print the final list.

Expected:
[300, 10, 20, 30, 40, 50]
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        list.addFirst(100);
        list.addLast(200);
        list.removeFirst();
        list.removeLast();
        list.addFirst(300);
        
        System.out.println(list);

	}
}
