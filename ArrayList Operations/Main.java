import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        // Add Java
        // Add Python
        // Add C++
        
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
    
        // Print first element
        System.out.println(languages.get(0));

        // Print second element
        System.out.println(languages.get(1));

        // Remove Python
        languages.remove("Python");

        // Print the whole list
        System.out.println(languages);

        // Print the size
        System.out.println(languages.size());
    }
}