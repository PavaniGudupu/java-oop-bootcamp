import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "Add Student");
        menu.put(2, "Search Student");
        menu.put(3, "Remove Student");
        menu.put(4, "Display All Students");
        menu.put(5, "Exit");
        
        for(Integer key: menu.keySet()) {
            System.out.println(key+". " + menu.get(key));
        }
        
        
        
        HashMap<Integer, String> map = new HashMap<>();
        
        System.out.print("\nChoice: ");
        int choice = sc.nextInt();
        int newchoice = choice;
        
        while(newchoice != 5) {
            switch(newchoice) {
                case 1: 
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    
                    System.out.print("Name: ");
                    String name = sc.next();
                    
                    map.put(id, name);
                    System.out.println("\nStudent Added");
                    
                    System.out.print("\nChoice: ");
                    newchoice = sc.nextInt();
                    break;
                    
                case 2: 
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();
                    
                    if (map.containsKey(searchId)) {
                        System.out.println("\n"+map.get(searchId));
                    } else {
                        System.out.println("\nStudent Not Found");
                    }
                    
                    System.out.print("\nChoice: ");
                    newchoice = sc.nextInt();
                    break;
                    
                case 3: 
                    System.out.print("Enter ID: ");
                    int removeId = sc.nextInt();
                    
                    if (map.containsKey(removeId)) {
                        map.remove(removeId);
                        System.out.println("\nStudent Removed");
                    } else {
                        System.out.println("\nStudent Not Found");
                    }
                    
                    System.out.print("\nChoice: ");
                    newchoice = sc.nextInt();
                    break;
                    
                case 4:
                    System.out.println();
                    for(Integer key: map.keySet()) {
                        System.out.println(+key + " " + map.get(key));
                    }
                    
                    System.out.print("\nChoice: ");
                    newchoice = sc.nextInt();
                    break;
                    
                default:
                    System.out.println("\nInvalid choice");
            }
        }
    }
}