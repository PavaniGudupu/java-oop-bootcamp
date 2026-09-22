/******************************************************************************
🚀 STACK — FINAL CHALLENGE 8: 🔥 Palindrome Using Stack

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop to build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare
        if (input.equals(reversed.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

