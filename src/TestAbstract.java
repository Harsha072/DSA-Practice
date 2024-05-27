import java.util.ArrayList;
import java.util.List;

abstract class Book2 {
    private String title;
    private String author;
    private double price;

    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract String getGenre();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
// Getters and setters for title, author, price
}

class FictionBook extends Book2 {
    private String plot;

    public FictionBook(String title, String author, double price, String plot) {
        super(title, author, price);
        this.plot = plot;
    }

    @Override
    String getGenre() {
        return "Fiction";
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
// Getters and setters for plot
}

class NonFictionBook extends Book2{
    private String topic;

    public NonFictionBook(String title, String author, double price, String topic) {
        super(title, author, price);
        this.topic = topic;
    }

    @Override
    String getGenre() {
        return "Non-Fiction";
    }

    // Getters and setters for topic
}

interface BookstoreOperations {
    void addBook(Book2 book);
    Book2 searchBook(String title);
    void displayBookDetails(Book2 book);
}

class Bookstore2 implements BookstoreOperations {
    private List<Book2> books;

    public Bookstore2() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book2 book) {
       books.add(book);
    }

    @Override
    public Book2 searchBook(String title) {
        Book2 book = null;
        for (Book2 b1:
             books) {
            if(b1.getTitle().equalsIgnoreCase(title)){
                System.out.println("found");
               book = b1;
                break;
            }
        }
        return book;

    }

    @Override
    public void displayBookDetails(Book2 book) {
        System.out.println(book.getTitle()+" "+book.getAuthor());
    }

    // Other methods to manage the bookstore
}

public class TestAbstract {
    public static void main(String[] args) {
        // Create instances of FictionBook and NonFictionBook
        FictionBook fictionBook = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99, "Tragedy");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", 20.50, "History");

        // Create a Bookstore
        Bookstore2 bookstore = new Bookstore2();

        // Add books to the Bookstore
        bookstore.addBook(fictionBook);
        bookstore.addBook(nonFictionBook);

        // Display book details
        Book2 searchedBook = bookstore.searchBook("The Great Gatsby");
        if (searchedBook != null) {
            bookstore.displayBookDetails(searchedBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}