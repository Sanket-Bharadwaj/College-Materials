package Q04andQ05;

public class Image {
    // Private attributes
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    // Default constructor
    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "undefined";
    }

    // Parameterized constructor
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    // Getter for imageWidth
    public int getImageWidth() {
        return imageWidth;
    }

    // Setter for imageWidth
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    // Getter for imageHeight
    public int getImageHeight() {
        return imageHeight;
    }

    // Setter for imageHeight
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    // Getter for colorCode
    public String getColorCode() {
        return colorCode;
    }

    // Setter for colorCode
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    // toString method
    @Override
    public String toString() {
        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode + "]";
    }
}