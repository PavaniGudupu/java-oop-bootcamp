import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Create (Push)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push: " + stack);

        // Read (Peek)
        System.out.println("Peek: " + stack.peek());

        // Delete (Pop)
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Search
        System.out.println("Search 10: " + stack.search(10));

        // Check Empty
        System.out.println("Is Empty? " + stack.isEmpty());

        // Size
        System.out.println("Size: " + stack.size());

        // Clear
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
