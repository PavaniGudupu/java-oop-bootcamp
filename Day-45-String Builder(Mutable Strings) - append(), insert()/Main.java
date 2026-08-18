import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    StringBuffer sb = new StringBuffer(str);
	    
		System.out.println("Original: " + sb);
		System.out.println("After Append: " + sb.append(" Programming"));
		System.out.println("After Insert: " + sb.insert(4, " SE"));
	}
}
