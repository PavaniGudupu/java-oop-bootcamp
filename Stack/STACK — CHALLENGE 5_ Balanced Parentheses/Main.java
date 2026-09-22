/******************************************************************************
🚀 STACK — CHALLENGE 5: Balanced Parentheses
1. create STACK
2. Take input of brackets
3. create boolean isBalanced
4. Loop through the input and push each char into Stack
5. if opening brackets - push else closing check stack empty..? if empty then isBalanced false and break
6. if opening and closing are not same then isBalanced false 
7. if stack is empty then also false

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        
        System.out.print("Input: ");
        String input = sc.nextLine();
        
        boolean isBalanced = true;
        
        for(char x: input.toCharArray()){
            if(x == '(' || x == '[' || x == '{') {
                stack.push(x);
            }
            
            else if(x == ')' || x == ']' || x == '}') {
                if(stack.isEmpty()){
                    isBalanced=false;
                    break;
                } 
                char top = stack.pop();
                if(
                    (x == ')' && top == '(') ||
                    (x == ']' && top == '[') ||
                    (x == '}' && top == '{')
                  ) {
                      isBalanced=true;
                  }
                else if (
                    (x == ')' && top != '(') || 
                    (x == '[' && top != ']') ||
                    (x == '{' && top != '}')                    
                    ) {
                        isBalanced=false;
                    }
            }
        }
        // Extra opening brackets
        if (!stack.isEmpty()) {
            isBalanced = false;
        }
        
        if(isBalanced == true) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

    }
}
