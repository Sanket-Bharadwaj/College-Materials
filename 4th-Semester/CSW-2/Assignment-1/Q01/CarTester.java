package Q01;
public class CarTester {
    public static void main(String[] args) {
        // Instantiate myCar1 with values
        Car myCar1 = new Car("Toyota", "Corolla");

        // Instantiate myCar2 with null
        Car myCar2 = new Car(null, null);

        // Print initial details of myCar1
        System.out.println("Initial details of myCar1:");
        System.out.println("Make: " + myCar1.getMake());
        System.out.println("Model: " + myCar1.getModel());

        // Print initial details of myCar2
        System.out.println("\nInitial details of myCar2:");
        System.out.println("Make: " + myCar2.getMake());
        System.out.println("Model: " + myCar2.getModel());

        // Update myCar2 using setters
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");

        // Print updated details of myCar2
        System.out.println("\nUpdated details of myCar2:");
        System.out.println("Make: " + myCar2.getMake());
        System.out.println("Model: " + myCar2.getModel());
    }
}
