package Q04&Q05;

public class ImageApp {
    public static void main(String[] args) {
        ImageLibrary imageLibrary = new ImageLibrary(10);

        Image image1 = new Image(1920, 1080, "#FFFFFF");
        Image image2 = new Image(1280, 720, "#FF5733");

        imageLibrary.insertImage(image1);
        imageLibrary.insertImage(image2);

        System.out.println("All Images:");
        imageLibrary.displayAllImages();

        String searchColorCode = "#FF5733";
        Image searchedImage = imageLibrary.searchImage(searchColorCode);
        if (searchedImage != null) {
            System.out.println("Searched Image: " + searchedImage.toString());
        } else {
            System.out.println("Image with color code " + searchColorCode + " not found.");
        }

        int index = 0;
        Image imageAtIndex = imageLibrary.getImage(index);
        if (imageAtIndex != null) {
            System.out.println("Image at Index " + index + ": " + imageAtIndex.toString());
        } else {
            System.out.println("No image at index " + index);
        }
    }
}
