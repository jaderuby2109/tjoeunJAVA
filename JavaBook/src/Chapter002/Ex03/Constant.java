package Chapter002.Ex03;

public class Constant {

	public static void main(String[] args) {

		final int MAX_NUM = 100;		// 선언과 동시에 초기화
		final int MIN_NUM;

		MIN_NUM = 0;					// 초기화 하지 않으면 오류 발생 => 사용하기 전 반드시 초기화

		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

		// MAX_NUM = 1000;				// 상수 값은 변경 할 수 없음
	}
}
