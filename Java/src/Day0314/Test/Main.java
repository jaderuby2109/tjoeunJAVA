package Day0314.Test;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		car.printString();
		System.out.println("name\t: " + car.name);

		System.out.println();

		Taxi taxi = new Taxi();
		taxi.printString();
		System.out.println("name\t: " + taxi.name);
		System.out.println("name2\t: " + taxi.name2);

		System.out.println();

		Car carTaxi = new Taxi();
		carTaxi.printString();
		System.out.println("name\t: " + carTaxi.name);
		//		System.out.println(carTaxi.name2);	: 에러남
		System.out.println("getName\t: " + carTaxi.getName());
		//		System.out.println("getName2\t: " + carTaxi.name);

		// Taxi TaxiCar = new Car();			: 에러남

	}

}
