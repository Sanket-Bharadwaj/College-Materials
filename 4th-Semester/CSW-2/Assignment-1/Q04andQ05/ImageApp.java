package Q04andQ05;

public class ImageApp {
    public static void main(String[] args) {
        // Create an ImageLibrary instance
        ImageLibrary library = new ImageLibrary();

        // Create images using both constructors
        Image defaultImage = new Image();
        Image parameterizedImage = new Image(1920, 1080, "#FFFFFF");

        // Insert images into the library
        library.insertImage(defaultImage);
        library.insertImage(parameterizedImage);

        // Print all images in the library
        System.out.println("All Images in Library:");
        for (Image img : library.getAllImages()) {
            System.out.println(img);
        }

        // Search for an image
        Image foundImage = library.searchImage(1920, 1080);
        if (foundImage != null) {
            System.out.println("Found Image: " + foundImage);
        } else {
            System.out.println("Image not found.");
        }

        // Get an image by index
        Image retrievedImage = library.getImage(0);
        if (retrievedImage != null) {
            System.out.println("Retrieved Image: " + retrievedImage);
        } else {
            System.out.println("No image found at this index.");
        }
    }
}