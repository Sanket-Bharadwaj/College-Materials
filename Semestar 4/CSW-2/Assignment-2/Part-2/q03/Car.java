package q03;


public class Car implements Comparable <Car> {
	private int modelNo, stock;
	private String name;
	public Car(int modelNo, String name, int stock) {
		super();
		this.modelNo = modelNo;
		this.stock = stock;
		this.name = name;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Car car) {
        if (this.getStock()>car.getStock())
        	return 1;
        else if (this.getStock()<car.getStock())
        	return -1;
        else
        	return 0;
	}
	

}
