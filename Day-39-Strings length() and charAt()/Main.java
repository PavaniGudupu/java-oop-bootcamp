import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Length: " + str.length());
		System.out.println("First Character: " + str.charAt(0));
		System.out.println("Last Character: " + str.charAt(str.length() - 1));
	}
}
