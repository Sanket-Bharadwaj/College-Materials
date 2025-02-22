package Q04&Q05;


public class ImageLibrary {
    private Image[] images;
    private int size;

    public ImageLibrary(int capacity) {
        images = new Image[capacity];
        size = 0;
    }

    public void insertImage(Image image) {
        if (size < images.length) {
            images[size++] = image;
        } else {
            System.out.println("Image library is full.");
        }
    }

    public Image searchImage(String colorCode) {
        for (int i = 0; i < size; i++) {
            if (images[i].getColorCode().equals(colorCode)) {
                return images[i];
            }
        }
        return null;
    }

    public Image getImage(int index) {
        if (index >= 0 && index < size) {
            return images[index];
        }
        return null;
    }

    public void displayAllImages() {
        for (int i = 0; i < size; i++) {
            System.out.println(images[i].toString());
        }
    }
}

