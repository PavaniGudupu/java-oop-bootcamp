/******************************************************************************
🚀 STACK — CHALLENGE 6 : Remove Adjacent Duplicates

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();  // remove duplicate
            } else {
                stack.push(ch);
            }
        }

        // Build final string
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        System.out.println(result.toString());
    }
}

