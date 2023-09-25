package week3.vince;

public class Book {
    private String title;
    private int pagesRead;
    private int totalPages;

    // Constructor
    public Book(String title, int totalPages) {
        this.title = title;
        this.pagesRead = 0;
        this.totalPages = totalPages;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for pagesRead
    public int getPagesRead() {
        return pagesRead;
    }

    // Setter for pagesRead
    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }

    // Getter for totalPages
    public int getTotalPages() {
        return totalPages;
    }

    // Setter for totalPages
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    // Method to increment pagesRead when reading
    public void readPages(int pages) {
        if (pages > 0 && (pagesRead + pages) <= totalPages) {
            pagesRead += pages;
            System.out.println("Read " + pages + " pages of '" + title + "'.");
        } else {
            System.out.println("Invalid page count. Cannot read more pages.");
        }
    }
}
