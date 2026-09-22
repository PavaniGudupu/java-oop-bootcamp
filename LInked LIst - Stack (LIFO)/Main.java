import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < 3; i++) {
            stack.push(sc.next());
        }

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());

        System.out.println("Remaining Stack: " + stack);
    }
}