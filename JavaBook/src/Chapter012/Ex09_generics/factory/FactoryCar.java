package Chapter012.Ex09_generics.factory;

public class FactoryCar<T extends Car> {

	public void addFuel(T t) {
		t.addFuel(100);
	}

	public void fixCar(T t) {
		System.out.println(t.name + "�� �����߽��ϴ�.");
	}
}
