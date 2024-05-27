import java.util.ArrayList;
import java.util.List;

// TODO: Implement a Book class with the following properties:
// - title (instance variable)
// - author (instance variable)
// - price (final instance variable)
// - quantity (static variable)
// - totalSales (static variable)

 class Book{
     String title;
     String author;

     final int price=0;

     static int quantity;
     static int totalSales;

     public Book(String title, String author) {
         this.title = title;
         this.author = author;
     }
 }

public class Bookstore {
    private List<Book> books;

    public Bookstore() {
        books = new ArrayList<>();
    }

    // Method to add a new book to the bookstore
    public void addBook(Book book) {
        // TODO: Add the book to the list of books
        // Update the quantity of books
    }

    // Method to update the details of a book
    public void updateBook(String title, String author, double price) {
        // TODO: Update the details (author and price) of the book with the given title
    }

    // Method to display the details of all books in the bookstore
    public void displayBooks() {
        // TODO: Display the details (title, author, price, quantity) of all books in the bookstore
    }

    // Method to calculate and display the total sales of all books
    public void calculateTotalSales() {
        // TODO: Calculate and display the total sales (price * quantity) of all books in the bookstore
    }

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // TODO: Create instances of Book and add them to the bookstore
        // TODO: Update the details of some books
        // TODO: Display the details of all books in the bookstore
        // TODO: Calculate and display the total sales of all books
    }
}
