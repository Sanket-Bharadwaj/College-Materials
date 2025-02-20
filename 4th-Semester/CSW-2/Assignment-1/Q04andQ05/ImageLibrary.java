package Q04andQ05;

import java.util.ArrayList;

public class ImageLibrary {
    private ArrayList<Image> images;

    // Constructor
    public ImageLibrary() {
        images = new ArrayList<>();
    }

    // Method to insert an image
    public void insertImage(Image image) {
        images.add(image);
    }

    // Method to search for an image by width and height
    public Image searchImage(int width, int height) {
        for (Image image : images) {
            if (image.getImageWidth() == width && image.getImageHeight() == height) {
                return image;
            }
        }
        return null; // Return null if not found
    }

    // Method to get an image by index
    public Image getImage(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        }
        return null; // Return null if index is out of bounds
    }

    // Method to get all images
    public ArrayList<Image> getAllImages() {
        return images;
    }
}