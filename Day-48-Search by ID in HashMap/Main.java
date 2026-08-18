import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        
        int searchId = sc.nextInt();
        if(map.containsKey(searchId)) {
            System.out.println(map.get(searchId));
        } else {
            System.out.println("Student Not Found");
        }
        
    }
}