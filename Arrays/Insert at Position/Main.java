import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int[] arr = new int[size + 1];
	    for(int i=0; i<size; i++) {
	        arr[i] = sc.nextInt();
	    }
	    
	    int position = sc.nextInt();
	    int value = sc.nextInt();
	    
	    for(int i=size; i>position; i--) {
	        arr[i] = arr[i-1];
	    }
	    
	    arr[position] = value;
	    size ++;
	    
	    System.out.println(Arrays.toString(arr));
	}
}


// size = int(input())
// arr = list(map(int, input().split()))
// position = int(input())
// value = int(input())

// # built in method
// arr.insert(position, value)

// # or upto postion, value, after position and so on....
// arr = arr[:position] + [value] + arr[position:]


// print(arr)