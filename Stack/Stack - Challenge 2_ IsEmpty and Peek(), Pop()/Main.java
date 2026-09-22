/*---

💻 Coding Challenge 2 — Safe Stack Operations

Create:

Stack<Integer> stack = new Stack<>();

Add:

10
20
30

Then:

Check whether the stack is empty.
Display the top element.
Pop the top element.
Display the new top element.
Pop all remaining elements using a loop.
Check whether the stack is empty again.
Expected final state
Stack is empty: false
Top: 30
Popped: 30
New Top: 20
...
Stack is empty: true

Important: Don't use a for loop with a fixed number of iterations for step 5. Use:

while (!stack.isEmpty())


---*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack is empty: " + stack.isEmpty());
        try{
            while (stack.isEmpty() == false) {
                System.out.println("Top: " + stack.peek());
                System.out.println("Popped: " + stack.pop());
                System.out.println("New Top: " + stack.peek());            
            }            
        } catch(EmptyStackException e) {
            System.out.println("Stack is empty: " + stack.isEmpty());
        }
        
    }
}
