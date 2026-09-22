import java.util.*;

class Movie implements Comparable<Movie> {
    int id;
    String title;
    String rating;
    int year;
    
    Movie(int id, String title, String rating, int year) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.year = year;
    }
    
    @Override
    public int compareTo(Movie object) {
        return Integer.compare(this.year, object.year);
    }
    
    @Override 
    public String toString() {
        return id + " " + title + " " + rating + " " + year;
    }
}


public class Main {
    public static void main(String args[]) {
        
        ArrayList<Movie> list = new ArrayList<>();
        
        list.add(new Movie(101, "Avengers", "*****", 2020));
        list.add(new Movie(102, "Batman", "***", 2018));
        list.add(new Movie(103, "Superman", "****", 2018));
        list.add(new Movie(104, "Iron Man", "*****", 2008));
        list.add(new Movie(105, "Thor", "****", 2011));

        list.sort((a, b) -> {
            if(a.rating.length() != b.rating.length()) {
                return Integer.compare(b.rating.length(), a.rating.length());
            } 
            if(a.year != b.year) {
                return Integer.compare(a.year, b.year);
            }
            return a.title.compareTo(b.title);
        });

        for(Movie obj : list) {
            System.out.println(obj);
            // System.out.println(obj.rating.length());
        }        

    }
}