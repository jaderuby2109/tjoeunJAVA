package Chapter010.Ex04;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("MyClass : X : x()");
	}

	@Override
	public void y() {
		System.out.println("MyClass : Y : y()");
	}

	@Override
	public void myMethod() {
		System.out.println("MyClass : MyInterface : myMethod()");
	}

	public void myMethod2() {
		System.out.println("MyClass : MyClass : myMethod2()");
	}
}
