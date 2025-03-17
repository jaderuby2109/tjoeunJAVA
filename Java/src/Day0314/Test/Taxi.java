package Day0314.Test;

public class Taxi extends Car {

	public String name;
	public String name2;

	public Taxi() {
		this.name  = "Taxi";
		this.name2 = "Taxi Car";

		System.out.println("Taxi 1");
	}

	public Taxi(String str) {
		this.name  = "Taxi";
		this.name2 = "Taxi Car";

		System.out.println("Taxi 2");
	}

	public void printString() {
		System.out.println("Taxi\t: " + this.name);
		System.out.println("Taxi\t: " + this.name2);
	}

	public String getName() {
		return this.name;
	}

	public String getName2() {
		return this.name2;
	}

}
