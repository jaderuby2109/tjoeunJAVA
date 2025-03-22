package Chapter010.Ex04;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		X xClass = mClass;
		xClass.x();
		System.out.println();
		
		Y yClass = mClass;
		yClass.y();
		System.out.println();
		
		MyInterface iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
//		iClass.myMethod2();
	}
}
