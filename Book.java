
class Book {
    String title;
    String author;
    double price;

    // 1. Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // 2. Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // 3. Constructor with title, author, and price
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Using the default constructor
        Book b1 = new Book();

        // Using the constructor with title and author
        Book b2 = new Book("Java Basics", "James");

        // Using the constructor with all three details
        Book b3 = new Book("Effective Java", "Joshua Bloch", 599.50);

        // Display details
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
