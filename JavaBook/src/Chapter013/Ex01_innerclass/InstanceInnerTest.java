package Chapter013.Ex01_innerclass;

class InstanceOutClass {				// 외부 클래스

	private int        num  = 10;		// 외부 클래스의 praivate 변수
	private static int sNum = 20;		// 외부 클래스 정적 변수
	private InClass    inClass;			// 내부 클래스형 변수

	public InstanceOutClass() {			// 외부 클래스 디폴트 생성자
		inClass = new InClass();		// 외부 클래스가 생성된 후에 내부 클래스 생성 가능
	}

	class InClass {						// 인스턴스 내부 클래스

		int        inNum  = 100;		// 내부 클래스의 인스턴스 변수
		static int sInNum = 200;		// 인스턴스 내부 클래스의 정적 변수(java 16부터 허용)

		void inTest() {
			System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수)");
			System.out.println("InClass sNum = " + inNum + " (인스턴스 내부 클래스의 인스턴스 변수)");
			System.out.println("InClass sNum = " + sInNum + " (인스턴스 내부 클래스의 정적 변수)");
		}

		static void sTest() {			// 인스턴스 내부 클래스의 정적 메서드(java 16부터 허용)
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수)");
			System.out.println("InClass sNum = " + sInNum + " (인스턴스 내부 클래스의 정적 변수)");
		}
	}

	public void usingClass() {			// 인스턴스 내부 클래스의 메서드 호출
		inClass.inTest();
		InClass.sTest();
	}
}

public class InstanceInnerTest {

	public static void main(String[] args) {

		System.out.println("외부 클래스 생성하기");
		InstanceOutClass outClass = new InstanceOutClass();
		System.out.println();
		
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println();
		
		System.out.println("외부 클래스 이용하여 인스턴스 내부 클래스 생성하기");
		InstanceOutClass.InClass inClass = outClass.new InClass();
		System.out.println();
		
		System.out.println("인스턴스 내부 클래스 메서드 호출");
		inClass.inTest();
		System.out.println();
		
		System.out.println("인스턴스 내부 클래스의 정적 메서드 호출");
		InstanceOutClass.InClass.sTest();

	}
}