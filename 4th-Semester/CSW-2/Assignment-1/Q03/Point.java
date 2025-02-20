package Q03; // Updated package name

public class Point {
    // Private attributes
    private double x;
    private double y;

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create a Point object using the parameterized constructor
        Point point1 = new Point(3.0, 4.0);
        
        // Create a Point object using the copy constructor
        Point point2 = new Point(point1);
        
        // Display original point values
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        
        // Modify point1
        point1.setX(5.0);
        point1.setY(6.0);
        
        // Display modified point values
        System.out.println("After modifying Point 1:");
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
    }
}