/******************************************************************************
🚀 STACK — CHALLENGE 3: Search
💻 Coding Challenge 3

Create a stack:

10
20
30
40
50

Then:

Search for 30
Search for 50
Search for 100
Display the results.
Explain why the returned positions are different from array indexes.
*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Create stack with elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Search for elements
        System.out.println("Search 30: " + stack.search(30));
        System.out.println("Search 50: " + stack.search(50));
        System.out.println("Search 100: " + stack.search(100));
        System.out.println(stack);
    }
}

