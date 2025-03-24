package Day0324.Ex01_Generics;

class TestClass {

	public <T> T testMethod() {
		// 타입에 따른 기본값 반환
		if (Integer.class.equals(Integer.class)) {
			return (T) Integer.valueOf(0); // Integer 타입 객체 반환
		} else if (String.class.equals(String.class)) {
			return (T) "야호"; // String 타입 객체 반환
		} else {
			return null; // 기본값을 알 수 없는 타입은 null 반환
		}
	}
}

class Car {
	String name = "name1";
}

class Taxi extends Car {
	String name = "name2";
}

public class GenericMethod2 {

	public static void main(String[] args) {
		TestClass gt = new TestClass();

		System.out.println(gt.<Integer>testMethod());
		System.out.println(gt.<String>testMethod());

	}
}
