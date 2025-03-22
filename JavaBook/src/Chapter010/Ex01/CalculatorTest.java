package Chapter010.Ex01;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));			// Calc 의 추상메서드, Calculator에서 구현
		System.out.println(calc.substract(num1, num2));		// Calc 의 추상메서드, Calculator에서 구현
		System.out.println(calc.times(num1, num2));			// Calc 의 추상메서드, CompleteCalc에서 구현
		System.out.println(calc.divide(num1, num2));		// Calc 의 추상메서드, CompleteCalc에서 구현
		System.out.println();

		calc.showInfo();						// CompleteCalc 의 메서드
		System.out.println();

		calc.description();						// Calc 의 default 메서드, CompleteCalc에서 오버라이드
		System.out.println();

		calc.description2();					// Calc 의 default 메서드
		System.out.println();

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Calc.total(arr));	// Calc 의 static 메서드

	}
}
