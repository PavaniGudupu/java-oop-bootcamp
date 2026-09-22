/******************************************************************************
💻 Coding Challenge 5 — Set Operations
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create sets A and B
        HashSet<Integer> setA = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        HashSet<Integer> setB = new HashSet<>(Arrays.asList(30, 40, 50, 60, 70));

        // 1. Union (A ∪ B)
        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        // 2. Intersection (A ∩ B)
        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        // 3. Difference (A − B)
        HashSet<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference A - B: " + difference);
    }
}
