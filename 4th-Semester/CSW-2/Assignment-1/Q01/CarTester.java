package Q01;

public class CarTester {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota", "Camry", 2022, 0);

        // Displaying initial car details
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Speed: " + myCar.getSpeed() + " km/h");

        // Accelerate the car
        myCar.accelerate(50);
        System.out.println("After acceleration, Speed: " + myCar.getSpeed() + " km/h");

        // Apply brake
        myCar.brake(20);
        System.out.println("After braking, Speed: " + myCar.getSpeed() + " km/h");
    }
}
