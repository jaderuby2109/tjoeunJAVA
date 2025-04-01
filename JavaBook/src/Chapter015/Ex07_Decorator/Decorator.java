package Chapter015.Ex07_Decorator;

public abstract class Decorator extends Coffee {

	Coffee coffee;

	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {

		coffee.brewing();
	}
}
