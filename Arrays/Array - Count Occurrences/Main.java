import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int i=0; i<array.length; i++) {
		    array[i] = sc.nextInt();
		}
		int search = sc.nextInt();
		boolean found = false;
		int count = 0;
		System.out.println();

       for(int n: array) {
           if(n == search) {
               count += 1;
               found = true;
               
           } 
       }
       
       
       if(found) {
           System.out.println("Occurrences: " + count);
       } else {
           System.out.println("Not Found");
       }

	}
}


// size = int(input())

// array = []
// count = 0

// for _ in range(size):
//     array.append(int(input()))
    
// search = int(input())
// print()   
 
// for i in array:
//     if search == i:
//         count += 1 
        
// if count>0:
//     print(f"Occurrences:  {count}")
// else:
//     print("Not Found")
