package Chapter012.Ex05_generics.factory;

public class ShipFactory <T extends Ship>{
	
	public void addFuel(T t) {
		 t.addFuel(100);
	}
	
	public void fixShip(T t) {
		System.out.println(t.name+ "�� �����߽��ϴ�.");
	}
}
