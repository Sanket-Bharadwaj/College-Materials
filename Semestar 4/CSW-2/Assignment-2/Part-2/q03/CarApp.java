import java.util.*;

public class CarApp {
    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(
            new Car(2013, "Creta", 10),
            new Car(2020, "MG", 13),
            new Car(2018, "Kia", 20),
            new Car(2017, "Audi", 45),
            new Car(2015, "BMW", 55)
        );

        Collections.sort(carList); // Correctly sorts the list

        System.out.println("Car\tModel\tStock");
        for (Car car : carList) {
            System.out.println(car.getName() + "\t" + car.getModelNo() + "\t" + car.getStock());
        }
    }
}
