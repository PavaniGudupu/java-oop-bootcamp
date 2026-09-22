import java.util.Scanner;

public class ReverseSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        int start = sc.nextInt(); // e.g. 1
        int end = sc.nextInt();   // e.g. 4

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
