import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(3);
        list.add(22);
        list.add(7);

        // Custom sort: even first, odd later, ascending inside both
        list.sort((a, b) -> {
            // Check even/odd grouping
            if (a % 2 == 0 && b % 2 != 0) {
                return -1; // a is even, b is odd → a comes first
            }
            if (a % 2 != 0 && b % 2 == 0) {
                return 1;  // a is odd, b is even → b comes first
            }
            // Both even or both odd → sort ascending
            return Integer.compare(a, b);
        });

        for (int num : list) {
            System.out.println(num);
        }
    }
}
