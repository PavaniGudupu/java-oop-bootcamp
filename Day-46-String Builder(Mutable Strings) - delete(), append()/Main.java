import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    StringBuilder sb = new StringBuilder(str);
	    
		System.out.println("Original: " + sb);
		System.out.println("After Delete: " + sb.delete(4, 16));
		System.out.println("After Insert: " + sb.append(" SE"));
	}
}
