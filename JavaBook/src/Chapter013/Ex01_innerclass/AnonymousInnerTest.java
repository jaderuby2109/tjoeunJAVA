package Chapter013.Ex01_innerclass;

class AnonymousOutClass {

	// 외부 클래스의 변수
	Runnable runner = new Runnable() {
		// 익명 내부 클래스
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};

	// 내부 클래스의 메소드
	Runnable myMethod(int i) {

		int num = 100;

		return new Runnable() {
			// 익명 내부 클래스
			@Override
			public void run() {
				// num = 200; // 익명 내부 클래스 밖의 변수는 사용 할 수 있으나 수정 할 수 없음
				// i = 10;
				System.out.println("메소드 인자 : " + i + " (외부 클래스의 내부 메소드 인자)");
				System.out.println("메소드 인자 : " + num + " (외부 클래스의 내부 메소드 변수)");
			}
		};
	}
}

public class AnonymousInnerTest {

	public static void main(String[] args) {

		AnonymousOutClass out = new AnonymousOutClass();
		// 외부 클래스의 메소드 호출
		Runnable runnerble = out.myMethod(10);
		runnerble.run();

		// 외부 클래스의 변수(객체)가 가지고 있는 메소드 호출
		out.runner.run();
	}
}
