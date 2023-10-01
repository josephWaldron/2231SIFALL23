package week4.Vince;

public class Book {
    private String title;
    private String author;
    // Constructor with parameters
    public Book(String newTitle, String newauthor) {
        this.title = newauthor;
        this.author = newTitle;
    }
    // Default constructor
    public Book() {
        this("Unknown","Noone");
    }
    // Getter for title
    public String getTitle() {
        return title;
    }
    // Setter for title
    public void setTitle(String newTitle) {
        this.title = title;
    }
    // Getter for author
    public String getAuthor() {
        return author;
    }
    // Setter for author
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    // Method to print book information
    public String toString() {
        return this.title + " by " + this.author;
    }
}
