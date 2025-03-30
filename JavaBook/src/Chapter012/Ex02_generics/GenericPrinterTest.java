package Chapter012.Ex02_generics;

import Chapter012.Ex01_generics.Plastic;
import Chapter012.Ex01_generics.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {

		// 파우더를 재료로 하는 프린터 생성
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

		// 프린터에 재료(파우더)를 넣음
		powderPrinter.setMaterial(new Powder());

		// 프린터가 그림을 그림
		powderPrinter.printing();

		// 프린터의 재료(파우더)를 꺼냄
		Powder powder = powderPrinter.getMaterial();

		// 프린터 상태 확인
		System.out.println(powderPrinter);
		System.out.println();

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		powderPrinter.printing();
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println();

		/*
		 * 제네릭을 사용하지 않고 직접 캐스팅 하는 경우
		 * GenericPrinter powderPrinter2 = new GenericPrinter();
		 * powderPrinter2.setMaterial(new Powder());
		 * Powder powder = (Powder)powderPrinter.getMaterial();
		 * System.out.println(powderPrinter);
		 */

		// 사용할 자료형을 제한하는 <T extends 클래스>
		// Material(재료종류)를 상속 받지 않은 클래스는 자료형 매개변수로 사용 할 수 없음
		// GenericPrinter<Water> printer = new GenericPrinter<Water>();
		// printer.setMaterial(new Water());
		// Water water = printer.getMaterial();
		// System.out.println(printer);
		
		// 사용할 자료형을 제한하지 않으면 <T>
		 GenericPrinter2<Water> printer = new GenericPrinter2<Water>();
		 printer.setMaterial(new Water());
		 Water water = printer.getMaterial();
		 System.out.println(printer);
	}
}
