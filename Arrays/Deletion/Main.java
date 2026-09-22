import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
		    arr[i] = sc.nextInt();
		}
		
		int index = sc.nextInt();
	    
	    //case 1: convert into arrayList and remove Iterable. Here arr is an obj so we loop Iterable
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int x: arr) {
	        list.add(x);
	    }
	    
	    list.remove(index);
	    Integer[] newArr = list.toArray(new Integer[0]);
	    System.out.println(Arrays.toString(newArr));
	    
	    
	    //case 2: 
	    
	    for(int i=index; i<size-1; i++) {
	        arr[i] = arr[i + 1];
	    }
	    
	    size --;
	    
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
            // if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
	    
	    
	}
}
