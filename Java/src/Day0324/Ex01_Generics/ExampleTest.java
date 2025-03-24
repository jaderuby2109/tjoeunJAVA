package Day0324.Ex01_Generics;

class GenericsMethod {
	public <T> T testMethod() {
		// return new T();
		return null;
	}
}

class GenericsMethodLimited {
	public <T extends Number> T testMethod() {
		Integer result1 = Integer.valueOf("10");
		Number result2 = Integer.valueOf(10);
		// return result;
		return null;
	}
}

class GenericsClass<T> {
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public <T> T testMethod() {
		// return t;
		return null;
	}
}

public class ExampleTest {

	public static void main(String[] args) {

		GenericsMethod        gm = new GenericsMethod();
		GenericsMethodLimited gl = new GenericsMethodLimited();
		GenericsClass<Number> gc = new GenericsClass<Number>();

		String  gmResult1 = gm.<String>testMethod();
		Integer gmResult2 = gl.<Integer>testMethod();
		String  gmResult3 = gc.<String>testMethod();

		System.out.println("gmResult1 : " + gmResult1);
		System.out.println("gmResult2 : " + gmResult1);
		System.out.println("gmResult3 : " + gmResult1);
	}
}