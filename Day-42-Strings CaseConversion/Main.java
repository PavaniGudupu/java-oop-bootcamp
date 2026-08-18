import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Upper: " + s.toUpperCase());
		System.out.println("Lower: " + s.toLowerCase());
		System.out.println("Trimmed: " + s.trim());
	}
}
