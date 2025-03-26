package Chapter013.Ex03_lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		// MyNumber를 구현 한 클래스로 객체 생성
		MyNumber max = (int x, int y) -> {
			return (x >= y) ? x : y;
		};

		// max 객체가 가진 메서드 호출
		System.out.println(max.getMax(10, 20));

		MyNumber max2 = (x, y) -> x < y ? x : y;
		System.out.println(max2.getMax(10, 20));
	}
}
