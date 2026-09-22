import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList<String> name = new LinkedList<>();

        name.add(sc.next());
        name.add(sc.next());
        name.addFirst("Admin");
        name.addLast("Guest");
        
        for(String x: name){
            System.out.println(x);
        }
    }
}