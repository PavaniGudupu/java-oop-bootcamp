import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(sc.nextInt(), sc.next());
        map.put(sc.nextInt(), sc.next());
        
        for(Integer key: map.keySet()) {
            System.out.println("Student " + key + ":" + " " + map.get(key));
        }
    }
}