import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product(101, "Rice", 50.000));
        list.add(new Product(102, "Sugar", 40.500));
        list.add(new Product(103, "Wheat", 55.750));
        list.add(new Product(104, "Oil", 40.500));  
        list.add(new Product(105, "Salt", 20.000));
        list.add(new Product(106, "Milk", 60.000));

        
        list.sort((a, b) -> {
            if (a.price != b.price) {
                return Double.compare(a.price, b.price);
            }
            return a.name.compareTo(b.name);
        });

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
