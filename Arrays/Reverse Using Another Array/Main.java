import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] rev = new int[size]; // another array

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        // Fill reverse array
        for(int i=0; i<size; i++) {
            rev[i] = arr[size - 1 - i];
        }

        // Print reversed array
        for(int i=0; i<size; i++) {
            System.out.println(rev[i]);
        }
    }
}
