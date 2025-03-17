package Day0314.Test;

public class Car {

	public String name;

	public Car() {
		this.name = "Car";

		System.out.println("Car 1");
	}

	public Car(String str) {
		this.name = "Car";

		System.out.println("Car 2");
	}

	public void printString() {
		System.out.println("Car\t: " + this.name);
	}

	public String getName() {
		return this.name;
	}

}
