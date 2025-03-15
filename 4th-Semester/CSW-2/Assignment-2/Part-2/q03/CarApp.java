package q03;


import java.util.ArrayList;
public class CarApp {
	public static void main (String args[])
	{
	ArrayList <Car> carList = new ArrayList<Car>();
	Car car1 = new Car(2013,"Creta", 10);
	Car car2 = new Car(2020, "MG", 13);
	Car car3 = new Car(2018, "Kia", 20);
	Car car4 = new Car(2017, "Audi", 45);
	Car car5 = new Car(2015, "BMW", 55);
	carList.add(car1);
	carList.add(car2);
	carList.add(car3);
	carList.add(car4);
	carList.add(car5);
	Car tempCar;
	for (Car i: carList)
	{
		for (Car j: carList)
		{
			if (i.compareTo(j)==1)
			{
				tempCar = i;
				i = j;
				j = tempCar;
			}
		}
	}
	System.out.println("Car\tModel\tStock");
	for (Car i: carList)
	{
		System.out.println(i.getName()+"\t"+i.getModelNo()+"\t"+i.getStock());
	}
	}
}
