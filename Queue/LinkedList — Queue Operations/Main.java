/******************************************************************************

Queue - Process of order in FIFO
collection framework which process the element that inserted first at rear and delete
from front.

💻 Coding Challenge 4

Create:

LinkedList<Integer> queue

Add:

10
20
30
40
50

Then:

Display the queue
Display the first element using peek()
Remove the first element using poll()
Remove another element using poll()
Display the final queue

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	
	LinkedList<Integer> queue = new LinkedList(Arrays.asList(10, 20, 30, 40, 50));
	
	System.out.println(queue);
	System.out.println(queue.peek());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
