/******************************************************************************
💻 Coding Challenge 5 — Queue Operations

Create:

LinkedList<Integer> queue

Add:

10
20
30
40
50

Then perform:

Add 5 to the queue.
Add 60 to the queue.
Display the first element using peek().
Remove two elements using poll().
Display the final queue.

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // Create LinkedList as Queue
        Queue<Integer> queue = new LinkedList<>();
        
        // Add initial elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
        // Add 5 to the queue
        queue.add(5);
        
        // Add 60 to the queue
        queue.add(60);
        
        // Display the first element using peek()
        System.out.println("First element: " + queue.peek());
        
        // Remove two elements using poll()
        queue.poll();
        queue.poll();
        
        // Display the final queue
        System.out.println("Final queue: " + queue);
    }
}
    