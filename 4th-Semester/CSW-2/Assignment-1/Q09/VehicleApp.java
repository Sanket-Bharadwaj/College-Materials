package Q09;

public class VehicleApp {
    public static void main(String[] args) {
        // Create instances of Car and Bicycle
        Vehicle myCar = new Car();
        Vehicle myBicycle = new Bicycle();

        // Test overridden methods
        myCar.accelerate();
        myCar.brake();

        myBicycle.accelerate();
        myBicycle.brake();

        // Test overloaded methods
        Car car = new Car();
        car.accelerate(60); // Overloaded method with speed
        car.accelerate(60, 5); // Overloaded method with speed and duration

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate(20); // Overloaded method with speed
        bicycle.accelerate(20, 3); // Overloaded method with speed and duration
    }
}