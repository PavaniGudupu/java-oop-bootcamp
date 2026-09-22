import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<String> names = new HashSet<>();
		
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
		        names.add(sc.next());
		}
		
		System.out.println("Unique Count: " + names.size());
	}
}
