package Q07;

import java.util.Date;

public class Magazine extends LibraryResource {
    private Date issueDate;

    // Constructor
    public Magazine(String title, String author, Date issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    // Getter
    public Date getIssueDate() {
        return issueDate;
    }

    // Setter
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    // Overridden method
    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + issueDate);
        System.out.println();
    }
}