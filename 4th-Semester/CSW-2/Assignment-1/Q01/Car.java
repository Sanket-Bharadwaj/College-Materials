package Q01;
public class Car {
    // Private fields
    private String make;
    private String model;

    // Parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
}
