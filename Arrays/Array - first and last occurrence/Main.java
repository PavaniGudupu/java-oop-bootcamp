import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6];
        int firstIndex = -1;
        int lastIndex = 0;
        
        for(int i=0; i<6; i++) {
            arr[i] = sc.nextInt();
        }
        
        int search = sc.nextInt();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == search) {
                if(firstIndex == -1) {
                    firstIndex = i;
                } else {
                    lastIndex = i;
                }
            }
            
        }
        
        System.out.println("First Index: " + firstIndex);
        System.out.println("Last Index: " + lastIndex);
	}
}





// arr = [10, 20, 10, 30, 10, 40]
// search = 10

// first_index = -1
// last_index = -1

// for i in range(len(arr)):
//     if arr[i] == search:
//         if first_index == -1:
//             first_index = i
//         last_index = i

// print("First Index :", first_index)
// print("Last Index  :", last_index)






