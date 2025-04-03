package Q07;

public class DVD extends LibraryResource {
    private int duration; // Duration in minutes

    // Constructor
    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    // Getter
    public int getDuration() {
        return duration;
    }

    // Setter
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Overridden method
    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + duration + " minutes");
        System.out.println();
    }
}