import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Contains Java: " + s.contains("Java"));
		System.out.println("Starts with J: " + s.startsWith("J"));
		System.out.println("Ends with a: " + s.endsWith("a"));
	}
}
