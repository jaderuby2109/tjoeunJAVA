package Day0317.Ex03_중첩클래스;

public class NestedClass2 {
	public static void main(String[] args) {
		// X
		// - Y	: 인스턴스 이너 클래스
		// - Z	: static 이너 클래스
		// * method
		// - L	: 로컬 클래스

		X x = new X();
		System.out.println();

		// 인스턴스 이너 클래스 객체 생성
		X.Y y = x.new Y();
		y.yInt = 10 ;
		X.Y.yStatic = 20 ;
		y.method1();
		X.Y.method2();
		System.out.println();

		// static 이너 클래스 객체 생성
		X.Z z = new X.Z();
		z.zInt = 100 ;
		X.Z.zStatic = 200 ;
		z.method1();
		X.Y.method2();
		System.out.println();

		// 로컬 클래스 객체 생성을 위한 메소드 호출
		// 내부에서 L객체 생성
		x.method();
	}
}