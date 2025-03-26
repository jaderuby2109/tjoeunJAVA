package Chapter013.Ex05_lambda;

public class TestLambda {

	public static void main(String[] args) {
		TestLambda testLambda = new TestLambda();

		// 1. 특정 자료형으로 변수 선언 후 값을 대입하여 사용하기
		PrintString lambdaCls = s -> System.out.println(s);
		lambdaCls.printStr("hello lambda_1");
		
		// 2. 매개 변수로 전달하기
		testLambda.printMyMethod(lambdaCls);

		// 3. 메서드의 반환 값으로 사용하기
		PrintString lambdaMet = testLambda.returnLambda();
		lambdaMet.printStr("hello ");
	}

	public void printMyMethod(PrintString str) {
		str.printStr("hello lambda_2");
	}

	public PrintString returnLambda() {
		return s -> System.out.println(s + "world");
	}
}
