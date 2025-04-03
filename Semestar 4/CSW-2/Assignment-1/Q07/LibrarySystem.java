package Q07;

import java.util.ArrayList;
import java.util.Date;

public class LibrarySystem {
    public static void main(String[] args) {
        // Create a list to hold library resources
        ArrayList<LibraryResource> resources = new ArrayList<>();

        // Instantiate various resources
        resources.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180));
        resources.add(new Magazine("National Geographic", "Various", new Date()));
        resources.add(new DVD("Inception", "Christopher Nolan", 148));

        // Display details of each resource
        for (LibraryResource resource : resources) {
            resource.displayDetails();
        }
    }
}