package Day0314.Ex06_접근지정자.A;

import Day0314.Ex06_접근지정자.B.Student;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name	: " + student.name);		// public
		System.out.println("age	: " + student.age);				// protected
		System.out.println("height	: " + student.getHeight());	// default
		System.out.println("weight	: " + student.getWeight());	// private
		System.out.println();

		Person person = new Person();
		System.out.println("name	: " + person.name);			// public
		System.out.println("age	: " + person.age);				// protected
		System.out.println("height	: " + person.height);		// default
		System.out.println("weight	: " + person.getWeight());	// private
		System.out.println();

	}
}
