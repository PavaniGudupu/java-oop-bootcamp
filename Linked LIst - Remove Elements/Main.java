import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinkedList<Integer> nums = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        for(int i = 1; i<=5; i++){
            nums.add(sc.nextInt());
        }
        nums.removeFirst();
        nums.removeLast();
        
        System.out.println();
        for(int x: nums){
            System.out.println(x);
        }
    }
}