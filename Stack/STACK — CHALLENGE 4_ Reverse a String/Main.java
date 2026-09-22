/******************************************************************************
🚀 STACK — CHALLENGE 4: Reverse a String
💻 Coding Challenge 4

Write a Java program that:
Takes a String using Scanner.

Creates:
Stack<Character> stack
Pushes every character into the stack.
Pops every character.
Builds and prints the reversed String.

Example
Input:  Output:

Hello   olleH

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		System.out.print("Enter a text: ");
		String input = sc.nextLine();
		
		for(Character x: input.toCharArray()) {
		    stack.push(x);
		}
		
		System.out.println(stack);
		
		StringBuilder reversed = new StringBuilder(); 
		while(!stack.isEmpty()) {
    		reversed.append(stack.pop());		    
		}
        System.out.println(reversed);
	}
}
