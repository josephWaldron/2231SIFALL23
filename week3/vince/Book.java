package week3.vince;

public class Book {
    private String title;
    private int pagesRead;
    private int totalPages;

    public Book(String title, int totalPages) {
        this.title = title;
        this.pagesRead = 0;
        this.totalPages = totalPages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPagesRead() {
        return pagesRead;
    }
    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }
    public int getTotalPages() {
        return totalPages;
    }
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
