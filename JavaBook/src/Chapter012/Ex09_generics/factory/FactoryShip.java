package Chapter012.Ex09_generics.factory;

public class FactoryShip<T extends Ship> {

	public void addFuel(T t) {
		t.addFuel(100);
	}

	public void fixShip(T t) {
		System.out.println(t.name + "�� �����߽��ϴ�.");
	}
}
