package Chapter012.Ex01;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter printer = new ThreeDPrinter();

		Powder p1 = new Powder();
		printer.setMaterial(p1);

		Powder p2 = (Powder) printer.getMaterial();
		// Plastic p3 = (Plastic) printer.getMaterial(); // 캐스팅 에러
		p2.doPrinting();
		p2.toString();

		Plastic p3 = new Plastic();
		printer.setMaterial(p3);

		Plastic p4 = (Plastic) printer.getMaterial();
		p4.doPrinting();
		p4.toString();

	}
}
