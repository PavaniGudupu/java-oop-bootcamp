import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        
        int search = sc.next();
        if(map.containsValue(search)) {
            System.out.println("Student Exists");
        } else {
            System.out.println("Student Not Found");
        }
        
    }
}