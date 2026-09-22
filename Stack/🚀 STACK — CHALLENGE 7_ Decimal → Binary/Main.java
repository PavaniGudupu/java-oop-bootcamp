/******************************************************************************
🚀 STACK — CHALLENGE 7: Decimal → Binary

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		System.out.println("Enter the Decimal number: ");
		int num = sc.nextInt();
		int x = num / 2;  //x=5
		int y = num % 2; // y=0
		stack.push(y);
		while(x!=0) {
		    x = x/2; //2, 1, 0
		    y = x%2; //1, 0, 1
		    stack.push(y);
		}
		StringBuilder result = new StringBuilder();
		while(!stack.isEmpty()) {
		    result.append(stack.pop());
		}
        System.out.println("Binary number: " + result);
	}
}

/******************************************************************************
 * correct solution
🚀 STACK — CHALLENGE 7: Decimal → Binary
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the Decimal number: ");
        int num = sc.nextInt();

        // Step 1: Push remainders into stack
        while (num > 0) {
            stack.push(num % 2);   // push remainder first
            num = num / 2;         // then divide
        }

        // Step 2: Pop to build binary string
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println("Binary number: " + result.toString());
    }
}
