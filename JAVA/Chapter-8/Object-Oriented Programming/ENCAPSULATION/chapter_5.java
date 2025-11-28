/* 
* Create an encapsulated class LibraryBook
* Private fields:
* title
* author
* isIssued

* Rules:
* Only issueBook() can set isIssued = true
* Only returnBook() can set isIssued = false
* No direct setter for isIssued
 */

class LibraryBook {
    private String title;
    private String author;
    private boolean isIssued;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false; // Default: Available
    }
    public LibraryBook(String title, String author , boolean isIssued) {
        this.title = title;
        this.author = author;
        this.isIssued = isIssued; // your choice of value
    }

    // Getter and Setter
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean isIssued() {
        return this.isIssued;
    }

    // Setter Methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book '" + title + "' has been issued successfully.");
        } else {
            System.out.println("I'm really sorry Sir, but '" + title + "' book is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book '" + title + "' has been returned successfully.");
        } else {
            System.out.println("Book '" + title + "' is not currently issued.");
        }
    }

    // toString method for better representation.
    public String toString() {
        String status = isIssued ? "Unavailable (Issued)" : "Available";
        return "Title : " + this.title + ", \nAuthor: " + this.author + ", \nStatus: " + status;
    }

}

public class chapter_5 {
    public static void main(String[] args) {
        // Create a LibraryBook Object
        LibraryBook book = new LibraryBook("Java Programming", "David Holmes");

        // Display Book Information
        System.out.println("------------Initial Book Information-------------");
        System.out.println(book);
        System.out.println();

        // Try to issue the book
        System.out.println("Issuing the book : ");
        book.issueBook();
        System.out.println("Is book Issued ? " + book.isIssued());
        System.out.println();

        // Try to issue the book again (Should show it's already issued)
        System.out.println("Trying to issue the same book again : ");
        book.issueBook();
        System.out.println();

        // Return the Book
        System.out.println("Returning the Book : ");
        book.returnBook();
        System.out.println("Is book Returned ? " + !book.isIssued());
        System.out.println();

        // Final Book Status
        System.out.println("Final Book Information : ");
        System.out.println(book);

        // Test with another book
        System.out.println("\n----Another Book Testing----\n");
        LibraryBook book1 = new LibraryBook("Data Structure & Algorithms", "Michael T. Goodrich" , true);
        System.out.println(book1);
        System.out.println();

        // Test with another book
        System.out.println("\n----Another Book Testing----\n");
        LibraryBook book2 = new LibraryBook("Python Programming", "Guido van Rossum" , false);
        System.out.println(book2);
        System.out.println();

    }
}
