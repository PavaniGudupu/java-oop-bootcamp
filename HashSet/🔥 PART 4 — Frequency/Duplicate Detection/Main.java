/******************************************************************************
💻 Coding Challenge 3 — Detect Duplicate
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean duplicateFound = false;

        // Read n integers
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (set.contains(x)) {
                duplicateFound = true;
                break; // no need to continue
            } else {
                set.add(x);
            }
        }

        // Output result
        if (duplicateFound) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("No Duplicates");
        }
    }
}
