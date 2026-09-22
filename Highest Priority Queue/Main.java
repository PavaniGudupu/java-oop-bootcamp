import java.util.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1; i<=num; i++) {
            int n = sc.nextInt();
            pq.offer(n);
        }
        
        System.out.println("Highest Priority: " + pq.poll());
        System.out.println();
        System.out.println("Remaining: ");
while (!pq.isEmpty()) {
    System.out.println(pq.poll());
}
    }
}