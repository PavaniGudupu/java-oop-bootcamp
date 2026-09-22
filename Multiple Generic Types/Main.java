import java.util.*;

class Pair<T, U> {
    T first;
    U second;
    
    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    
    public void display() {
        System.out.println(first + " " + second);
    }
}

public class Main {
    public static void main(String args[]) {
        Pair<Integer, String> obj1 = new Pair<>(101, "Pavani");
        Pair<Integer, String> obj2 = new Pair<>(102, "Rahul");
        Pair<Integer, String> obj3 = new Pair<>(103, "Swetha");
        
        obj1.display();
        obj2.display();
        obj3.display();
    }
}

