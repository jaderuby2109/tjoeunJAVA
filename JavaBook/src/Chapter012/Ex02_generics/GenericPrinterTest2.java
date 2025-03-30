package Chapter012.Ex02_generics;

import Chapter012.Ex01_generics.Plastic;
import Chapter012.Ex01_generics.Powder;

public class GenericPrinterTest2 {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
	}
}
