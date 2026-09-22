/******************************************************************************
Merge two ArrayList<Integer> objects into one.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		ArrayList<Integer> num1 = new ArrayList<>();
		for(int i = 10; i<=20; i++) {
		    num1.add(i);
		}

		ArrayList<Integer> num2 = new ArrayList<>();
		for(int i = 21; i<=30; i++) {
		    num2.add(i);
		}		
		
		ArrayList<Integer> nums = new ArrayList<>(num1);
        nums.addAll(num2);
        System.out.println(nums);
	}
}
