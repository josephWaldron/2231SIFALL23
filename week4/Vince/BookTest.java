package week4.Vince;

public class BookTest {
    /*
     * This program should print out:
     * 
     * The Great Gatsby by F. Scott Fitzgerald
     * To Kill a Mockingbird by Harper Lee
     * Unknown by Noone
     * Title by Author
     * 
     */
    public static void main(String[] args) {
        // Create an array of size 3 to hold Book objects
        Book[] books = new Book[4];

        // Fill the array with different books
        books[0] = new Book("The Gr", "F. Scott Fitzgerald");
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee");
        books[2] = new Book(); // Using the default constructor for an unknown book
        books[3] = new Book("Title","Author");

        books[0].setTitle("The Great Gatsby");

        // Print out the information of each book
        for (int i = 3; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
