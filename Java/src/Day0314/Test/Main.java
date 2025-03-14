package Day0314.Test;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		car.printString();
		System.out.println(car.name);

		System.out.println();

		Taxi taxi = new Taxi();
		taxi.printString();
		System.out.println(taxi.name);
		System.out.println(taxi.name2);

		System.out.println();

		Car carTaxi = new Taxi();
		carTaxi.printString();
		System.out.println(carTaxi.name);
		// System.out.println(carTaxi.name2);	: 에러남

		// Taxi TaxiCar = new Car();			: 에러남

		int arr[] = { 1, 2, 3, 4, 5 };
		temp(arr);
		for (int i : arr) {
			System.out.print(i + "\t");
		}

	}

	public static void temp(int[] arr) {
//		for (int i : arr) {
//			i *= 10;
//		}
//		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 10;
			
		} 

	}
}
