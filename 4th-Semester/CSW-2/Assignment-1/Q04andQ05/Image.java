package Q04&Q05;

public class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image() {
        this(0, 0, "#000000");
    }

    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public int getImageWidth() { return imageWidth; }
    public int getImageHeight() { return imageHeight; }
    public String getColorCode() { return colorCode; }

    public void setImageWidth(int imageWidth) { this.imageWidth = imageWidth; }
    public void setImageHeight(int imageHeight) { this.imageHeight = imageHeight; }
    public void setColorCode(String colorCode) { this.colorCode = colorCode; }

    public String toString() {
        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode + "]";
    }
}
