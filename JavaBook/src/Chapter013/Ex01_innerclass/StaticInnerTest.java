package Chapter013.Ex01_innerclass;

class StaticOutClass {

	public int        num  = 10;		// 외부 클래스의 public 변수
	private static int sNum = 20;		// 외부 클래스 정적 변수
	
	private InClass    inClass;			// 내부 클래스형 변수

	public StaticOutClass() {			// 외부 클래스 디폴트 생성자
		inClass = new InClass();		// 외부 클래스가 생성된 후에 내부 클래스 생성 가능
	}

	static class InClass {						// 인스턴스 내부 클래스

		int        inNum  = 100;		// 내부 클래스의 인스턴스 변수
		static int sInNum = 200;		// 인스턴스 내부 클래스의 정적 변수(java 16부터 허용)

		void inTest() {
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

//	static class InStaticClass {
//
//		int        inNum  = 100;
//		static int sInNum = 200;
//
//		void inTest() {
//			// num += 10;
//			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
//			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
//			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
//		}
//
//		static void sTest() {
//			// num += 10;
//			// inNum += 10;
//
//			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
//			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
//
//		}
//	}
}

public class StaticInnerTest {

	public static void main(String[] args) {

		
		StaticOutClass outClass = new StaticOutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
		System.out.println();
		
		
		StaticOutClass.InClass inClass = outClass.new InClass();
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass.inTest();
		
		System.out.println();
		

		StaticOutClass.InStaticClass sInClass = new StaticOutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();

		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		StaticOutClass.InStaticClass.sTest();

	}
}