import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=1; i<=num; i++) {
            pq.offer(sc.nextInt());
        }
        System.out.println();
        for(int i=1; i<=num; i++) {
            System.out.println(pq.poll());
        }
        
    }
}