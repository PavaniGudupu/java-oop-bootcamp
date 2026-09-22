import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        
        try{
            for(int i=1; i<=num; i++) {
                array.add(sc.nextInt());
            }            
        } catch (ArrayStoreException ae) {
            System.out.println("array error" + ae);
        }
        
        System.out.println("\nAscending: ");
        Collections.sort(array);
        for(Integer x: array) {
            System.out.println(x);
        }
        System.out.println("\nDescending: ");
        Collections.sort(array, Collections.reverseOrder());
        for(Integer x: array) {
            System.out.println(x);
        }        
    }
}