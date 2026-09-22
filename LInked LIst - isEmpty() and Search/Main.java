import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> nums = new Stack<>();
        
        for(int i=1; i<=5; i++) {
            nums.push(sc.nextInt());
        }
        
        System.out.println();
        int searchNum = sc.nextInt();
        int result = nums.search(searchNum);
        // for(int x: nums) {
        if (result > 0) {
            System.out.println("Found at position " + result + " from the top.");
            // break;
        } else {
            System.out.println("Not Found");
            // break;
        }            
      
//   }
        
    }
}