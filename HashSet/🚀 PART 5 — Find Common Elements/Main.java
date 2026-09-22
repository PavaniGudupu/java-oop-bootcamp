/******************************************************************************
💻 Coding Challenge 4 — Find Common Elements
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60, 70));
        HashSet<Integer> set = new HashSet<>();
        for(int x: set1){
            if(set2.contains(x)) {
                set.add(x);
            }
        }
        
        System.out.println(set);

    }
}
