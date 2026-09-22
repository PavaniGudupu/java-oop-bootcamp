import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int i=0; i<size; i++) { // i<array.len - better for dynamic array
		    array[i] = sc.nextInt();
		}
		System.out.println();

        int sum = 0;
        int max = 0; 
        // max = array[0] cause 0 may not exists in array and 
        //if arr contains -ve value then result will be misleads
        
        int min = array[0];
        double avg = 0;
        for(int n: array) {
            sum += n;
            if(n>max) {
                max = n;
            } 
            if(n<max && n<min) {
                min = n;
            }
        }
        avg = (double)sum/size;
        
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + avg);

	}
}
