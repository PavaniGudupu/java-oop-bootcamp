import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String f_sub = s.substring(0, 7);
		System.out.println(f_sub);
		String l_sub = s.substring(7);
		System.out.println(l_sub);
	}
}
