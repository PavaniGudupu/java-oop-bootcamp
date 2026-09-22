import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        for(int i = 1; i<=5; i++) {
            names.add(sc.next());
        }
        
        String searchName = sc.next();
        if (names.contains(searchName)) {
            System.out.println("Found");
            names.remove(searchName);
        } else {
            System.out.println("Not Found");
        }
        
        System.out.println("Remaining Names: ");
        for(String name: names) {
            System.out.println(name);
        }
    }
}