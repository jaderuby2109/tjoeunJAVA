package Chapter012.Ex05_generics.factory;

public class CarFactory<T extends Car> {
	
	public void addFuel(T t) {
		 t.addFuel(100);
	}
	
	public void fixCar(T t) {
		System.out.println(t.name+ "�� �����߽��ϴ�.");
	}
}
