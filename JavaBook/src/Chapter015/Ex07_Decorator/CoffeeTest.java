package Chapter015.Ex07_Decorator;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee keynaAmericano = new KenyaAmericano();
		keynaAmericano.brewing();

		System.out.println("\n***************");

		Coffee keynaLatte = new Latte(new KenyaAmericano());
		keynaLatte.brewing();

		System.out.println("\n***************");
		Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
		etiopiaLatte.brewing();

		System.out.println("\n***************");

		EtiopiaAmericano etiopiaCoffee       = new EtiopiaAmericano();
		Mocha            andMocha            = new Mocha(etiopiaCoffee);
		Latte            andLatte            = new Latte(andMocha);
		WhippedCream     andWhippedCream     = new WhippedCream(andLatte);
		Coffee           whippedCreamEtiopia = andWhippedCream;
		whippedCreamEtiopia.brewing();
	}
}
