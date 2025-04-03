package Q07;

public class Book extends LibraryResource {
    private int pageCount;

    // Constructor
    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    // Getter
    public int getPageCount() {
        return pageCount;
    }

    // Setter
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Overridden method
    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + pageCount);
        System.out.println();
    }
}