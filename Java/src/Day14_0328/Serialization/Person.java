package Day14_0328.Serialization;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5462107130765454782L;

	// 직렬화
	// * Serializable 인터페이스를 구현해야 직렬화 객체를 정의할 수 있다.
	private String name;
	private int    age;
	private String address;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}

}
