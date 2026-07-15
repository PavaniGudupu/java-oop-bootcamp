import java.util.*;

class Book {
    int bookId;
    String bookTitle;
    double price;
    
    Book(int bookId, String bookTitle, double price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.price = price;
    }
    
    public void displayDetail() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Price: " + price);
    }
}

class Library {
    public static Book findBookWithLowestPrice(Book[] books) {
        double lowestPrice = books[0].price;
        for(Book i: books) {
            if(lowestPrice <= i.price){
                return i;
            } else {
                lowestPrice = i.price;
            }
        
        }
        
        return null;
        
    }
    
    public static Book findBookByTitle(Book[] books, String search) {
        for(Book x: books) {
            if(search == x.bookTitle){
                return x;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of books you want to store: ");
        int size = sc.nextInt();
        
        Book[] bookArray = new Book[size];
        
        for(int i = 0; i<bookArray.length; i++) {
            System.out.println("Enter the bookId: ");
            int bookId = sc.nextInt();
            System.out.println("Enter the book Name: ");
            String bookName = sc.next();
            System.out.println("Enter the book price: ");
            double bookPrice = sc.nextDouble();
            
            bookArray[i] = new Book(bookId, bookName, bookPrice);
        }
        
        
        Book LowestPriceResult = Library.findBookWithLowestPrice(bookArray);
        System.out.println("Lowest Book is: ");
        LowestPriceResult.displayDetail();
        
        
        System.out.println("Enter the Book Name to search: ");
        String searchBook = sc.next();
        
  
        Book findBookResult = Library.findBookByTitle(bookArray, searchBook);
        if(findBookResult != null) {
            System.out.println("Book Found: ");
            findBookResult.displayDetail();
        } else {
            System.out.println("Book Not Found: ");
        }
        
        
        
    }
}
