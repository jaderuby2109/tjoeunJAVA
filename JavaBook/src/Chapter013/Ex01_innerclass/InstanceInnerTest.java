package Chapter013.Ex01_innerclass;

class InstanceOutClass {				// 외부 클래스

	private int        outNum  = 10;	// 외부 클래스의 praivate 변수
	private static int outSNum = 20;	// 외부 클래스 정적 변수
	private InClass    innerClass;		// 내부 클래스형 변수

	public InstanceOutClass() {			// 외부 클래스 디폴트 생성자
		innerClass = new InClass();		// 외부 클래스가 생성된 후에 내부 클래스 생성 가능
	}

	class InClass {						// 인스턴스 내부 클래스

		int        inNum  = 100;		// 내부 클래스의 인스턴스 변수
		static int inSNum = 200;		// 인스턴스 내부 클래스의 정적 변수(java 16부터 허용)

		void inMethod() {
			System.out.println("\t\t---내부 메서드");
			System.out.println("\t\tOutClass outNum = " + outNum);
			System.out.println("\t\tOutClass outSNum = " + outSNum);
			System.out.println("\t\tInClass inNum = " + inNum);
			System.out.println("\t\tInClass inSNum = " + inSNum);
		}

		static void inSMethod() {		// 인스턴스 내부 클래스의 정적 메서드(java 16부터 허용)
			System.out.println("\t\t---내부 정적 메서드");
			//System.out.println("\t\tOutClass outNum = " + outNum);
			System.out.println("\t\tOutClass outSNum = " + outSNum);
			//System.out.println("\t\tInClass inNum = " + inNum);
			System.out.println("\t\tInClass inSNum = " + inSNum);
		}
	}

	public void outMethod() {			// 인스턴스 내부 클래스의 메서드 호출
		System.out.println("\t외부 클래스로 내부 메소드 호출");
		innerClass.inMethod();
		System.out.println("\t외부 클래스로 내부 정적 메소드 호출");
		InClass.inSMethod();
	}
}

public class InstanceInnerTest {

	public static void main(String[] args) {

		System.out.println("1. 외부 클래스 생성하기");
		InstanceOutClass outClass = new InstanceOutClass();
		System.out.println();

		System.out.println("2. 외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.outMethod();
		System.out.println();

		System.out.println("3. 외부 클래스 이용하여 내부 클래스 생성하기");
		InstanceOutClass.InClass inClass = outClass.new InClass();
		System.out.println();

		System.out.println("4. 내부 클래스의 메서드 호출");
		inClass.inMethod();
		System.out.println();

		System.out.println("5. 내부 클래스의 정적 메서드 호출");
		InstanceOutClass.InClass.inSMethod();

	}
}