import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Original: " + s);
		String newString = s.replace("Programming", "Coding");
		System.out.println("Updated: " + newString);
		System.out.println("First index of a: " + s.indexOf('a'));
		System.out.println("Last index of a: " + s.lastIndexOf('a'));
	}
}
