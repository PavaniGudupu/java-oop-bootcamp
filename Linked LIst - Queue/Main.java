import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Queue<String> names = new LinkedList<>();
        
        for(int i=1; i<=3; i++) {
            names.offer(sc.next());
        }
        
        System.out.println(names.peek());
        System.out.println(names.poll());
        System.out.println();
        System.out.println("Remaining names: " + names);
        // for(String name: names) {
        //     System.out.println(name);
        // }
    }
}