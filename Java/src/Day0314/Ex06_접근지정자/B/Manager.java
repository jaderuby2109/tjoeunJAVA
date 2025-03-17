package Day0314.Ex06_접근지정자.B;

import Day0314.Ex06_접근지정자.A.Person;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name	: " + student.name);
		// * 접근 지정자는 선언한 클래스를 기준으로 적용된다.
		// protected : 상속받지 않아서 사용 불가
		// Manager와 Student는 같은 패키지 안에 존재하지만,
		// age가 선언된 클래스는 Person 다른 패키지 안에 존재한다.
		// System.out.println("age	: " + student.age);			
		System.out.println("age	: " + student.getAge());
		System.out.println("height	: " + student.getHeight());
		System.out.println("weight	: " + student.getWeight());
		System.out.println();

		Person person = new Person();
		System.out.println("name	: " + person.name);
		System.out.println("age	: " + person.getAge());
		System.out.println("height	: " + person.getHeight());
		System.out.println("weight	: " + person.getWeight());
		System.out.println();

	}
}
