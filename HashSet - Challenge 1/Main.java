import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        set.add(sc.next());
        set.add(sc.next());
        set.add(sc.next());
        set.add(sc.next());
        set.add(sc.next());
        
        System.out.println("Unique Names: ");
        for(String name: set) {
            System.out.println(name);
        }
    }
}